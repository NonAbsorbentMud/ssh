package own.cfb.user.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.jdbc.object.BatchSqlUpdate;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import own.cfb.user.dao.UserDao;
import own.cfb.user.model.Users;

import java.io.Serializable;
import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public Users getUserByAccount(String account) {
        return (Users) super.getHibernateTemplate().execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                String hql="from Users where phone=?";
                if( account.length()!=11){
                    hql="from Users where idCard=?";
                }
                Query query = session.createQuery(hql);
                query.setParameter(0,account);
                return query.uniqueResult();
            }
        });
    }

    @Override
    public Users saveUser(Users user){
        Serializable i = super.getHibernateTemplate().save(user);
        return super.getHibernateTemplate().get(Users.class, i);
    }

    @Override
    public Users updateUser(Users user) {
        super.getHibernateTemplate().update(user);
        return super.getHibernateTemplate().get(Users.class,user.getUserId());
    }

    @Override
    public void deleteUser(Users user) {
        super.getHibernateTemplate().delete(user);
    }

    @Override
    public List<Users> getAllUsers(Integer page, Integer size) {
        return (List<Users>) super.getHibernateTemplate().execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery("from Users");
                query.setFirstResult(page);
                query.setMaxResults(size);
                return query.list();
            }
        });
    }

    @Override
    public <T> List<Users> getUsersByField(String fieldColumn, T value) {
        String hql= String.format("from Users where %s=?", fieldColumn);
        return (List<Users>) super.getHibernateTemplate().find(hql,value);
    }
}
