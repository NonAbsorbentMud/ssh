package own.cfb.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import own.cfb.test.action.TestAction;
import own.cfb.test.domain.BeanOne;
import own.cfb.test.domain.BeanTwo;

public class TestSpring {

    @Test
    public void test(){
        this.getSpringConfig();
        this.getBeanFactory();

    }
    public void getSpringConfig(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        BeanTwo beanTwo=(BeanTwo)applicationContext.getBean("beanTwo");
        System.out.println(beanTwo.printTwo());
    }
    public void getBeanFactory(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        BeanOne beanOne=(BeanOne)beanFactory.getBean("beanOne");
        System.out.println(beanOne.printOne());
    }
}
