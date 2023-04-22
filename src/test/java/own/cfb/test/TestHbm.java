package own.cfb.test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import own.cfb.test.domain.GradeClass;
import own.cfb.test.domain.StudentCard;
import own.cfb.test.model.*;
import own.cfb.utils.HibernateUtil;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHbm {

    @Test
    public void test(){
        //this.saveData();
        //this.oneToOneSave();
        //this.manyToOneSave();
        //this.manyToManySave();
        //this.findByQuery();
        //this.executeByQuery();
        //this.joinByQuery();
        //this.findByCriteria();
        //this.findByDetachedCriteria();
        //this.findBySQLQuery();
    }

    /**
     * 原生SQLquery查询
     */
    public void findBySQLQuery(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        String sql="select * from Grade where gradeCode between ? and :gradeCode order by gradeCode desc";
        SQLQuery sqlQuery=session.createSQLQuery(sql);
        sqlQuery.setInteger(0,2);
        sqlQuery.setParameter("gradeCode",5);
        sqlQuery.setFirstResult(0);
        sqlQuery.setMaxResults(2);
        List<Object[]> list=sqlQuery.list();
        for (Object[] object:list){
            for(int i=0;i<object.length;i++){
                System.out.println(object[i]);
            }
        }
        transaction.commit();
    }
    /**
     * DetachedCriteria的查询
     */
    public void findByDetachedCriteria(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        DetachedCriteria detachedCriteria= DetachedCriteria.forClass(Grade.class);
        detachedCriteria.add(Restrictions.eq("gradeName","三年级"));
        Criteria criteria=detachedCriteria.getExecutableCriteria(session);
        List<Grade> grades=criteria.list();
        System.out.println(grades.toString().toString());
        transaction.commit();
    }
    /**
     * Criteria查询
     */
    public void findByCriteria(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Criteria criteria=session.createCriteria(Grade.class);
        criteria.add(Restrictions.like("gradeName","一%"));
        criteria.addOrder(Order.desc("gradeCode"));
        criteria.setFirstResult(0);
        criteria.setMaxResults(3);
        List<Grade> grades=criteria.list();
        System.out.println(grades.toString().toString());
        System.out.println(grades.get(0).getClasses().toString());
        criteria.setProjection(Projections.rowCount());
        List list=criteria.list();
        System.out.println(list.toString());
        transaction.commit();
    }

    /**
     * query的连接查询
     */
    public void joinByQuery(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        String hql="select s.stuCode,s.stuName,c.cardCode,c.value from Student s join Card c " +
                "on s.stuCode=c.cardCode";
        Query query=session.createQuery(hql);
        List<Object[]> list=query.list();
        for (Object[] object:list){
            System.out.println(object[0]);
            System.out.println(object[1]);
            System.out.println(object[2]);
            System.out.println(object[3]);
        }
        transaction.commit();
    }
    /**
     * query的修改删除
     */
    public void executeByQuery(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        String hql="update Classes set className='三班' where classCode=3";
        String hql1="update Classes set className='四班' where classCode=4";
        Query query=session.createQuery(hql);
        Query query1=session.createQuery(hql1);
        query.executeUpdate();
        query1.executeUpdate();
        transaction.commit();
    }
    /**
     * query查询
     */
    public void findByQuery(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        String hql="from Grade g where g.gradeCode between ? and :gradeCode" +
                " or g.gradeName like '%年级' order by g.gradeCode desc";
        Query query=session.createQuery(hql);
        query.setInteger(0,2);
        query.setInteger("gradeCode",4);
        query.setFirstResult(0);
        query.setMaxResults(3);
        List<Grade> grades= query.list();
        System.out.println(grades.toString().toString());
        transaction.commit();
    }
    /**
     * 多对多保存
     */
    public void manyToManySave(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Grade grade=new Grade();
        grade.setGradeName("五年级");

        Grade grade1=new Grade();
        grade1.setGradeName("六年级");

        //Classes c=new Classes();
        //c.setClassName("一班");
        Classes c=session.get(Classes.class,1);
        //Classes c1=new Classes();
        //c1.setClassName("二班");
        Classes c1=session.get(Classes.class,2);

        c.getGrades().add(grade);
        c.getGrades().add(grade1);
        c1.getGrades().add(grade);
        c1.getGrades().add(grade1);
        //Set<Grade> grades=new HashSet<>();
        //grades.add(grade);
        //grades.add(grade1);

        //Set<Classes> classes=new HashSet<>();
        //classes.add(c);
        //classes.add(c1);

        //grade.setClasses(classes);
        //grade1.setClasses(classes);

        session.save(grade);
        session.save(grade1);
        session.save(c);
        session.save(c1);
        transaction.commit();
    }
    /**
     * 多对一保存
     */
    public void manyToOneSave(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();

        Teacher teacher=new Teacher();
        teacher.setTeaName("语文教师");
        Set<Student> students=new HashSet<>();

        Student stu=new Student();
        stu.setStuName("cfb");
        stu.setTeacher(teacher);

        Student stu1=new Student();
        stu1.setStuName("cc");
        stu1.setTeacher(teacher);

        students.add(stu);
        students.add(stu1);
        teacher.setStudents(students);

        Card card=new Card();
        card.setValue(100d);
        card.setStudent(stu);

        Card card1=new Card();
        card1.setValue(100d);
        card1.setStudent(stu1);

        stu.setCard(card);
        stu1.setCard(card1);

        session.save(teacher);
        transaction.commit();
    }
    /**
     * 一对一删除
     */
    public void oneToOneDel(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Student stu=session.get(Student.class,3);
        Card card=stu.getCard();
        System.out.println("CARD:"+card.toString());
        session.delete(stu);
        transaction.commit();
    }
    /**
     * 一对一保存
     */
    public void oneToOneSave(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Student stu=new Student();
        Card card=new Card();
        stu.setStuName("cfb");
        card.setValue(100d);
        card.setStudent(stu);
        stu.setCard(card);
        session.save(stu);
        transaction.commit();
    }
    /**
     * 保存数据
     */
    public void saveData(){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        TestTable testTable=new TestTable();
        testTable.setTestName("tt");
        testTable.setVersion(1);
        testTable.setStatus(0);
        testTable.setCreateTime(new Date());
        session.save(testTable);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
