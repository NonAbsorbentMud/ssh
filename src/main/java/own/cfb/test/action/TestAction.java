package own.cfb.test.action;

import com.opensymphony.xwork2.ActionSupport;
import own.cfb.test.model.Grade;
import own.cfb.test.service.TestService;

import java.util.List;

public class TestAction extends ActionSupport {

    private TestService testService;

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    //用于访问/web-inf/jsp/test/test.jsp
    public String test(){
        return "test";
    }


    public String getAllGrades(){
        List<Grade> list= this.testService.getAllGrades();
        System.out.println(list.toString().toString());
        return "grade";
    }

}
