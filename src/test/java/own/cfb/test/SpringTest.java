package own.cfb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import own.cfb.test.model.Grade;
import own.cfb.test.model.TestTable;
import own.cfb.test.service.TestService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class SpringTest {
    @Autowired
    TestService testService;

    @Test
    public void test(){
        this.jdbcTest();
    }
    public void jdbcTest(){
        List<Grade> allGrades = testService.getAllGrades();
        for (Grade grade: allGrades){
            System.out.println(grade.toString());
        }
    }
}
