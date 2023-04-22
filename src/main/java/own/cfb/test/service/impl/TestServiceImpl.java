package own.cfb.test.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import own.cfb.test.dao.TestDao;
import own.cfb.test.model.Grade;
import own.cfb.test.model.TestTable;
import own.cfb.test.service.TestService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestServiceImpl implements TestService {

    private TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public List<Grade> getAllGrades() {
        List<Grade> list=new ArrayList<>();
        List<Map<String, Object>> allGrades = this.testDao.getAllGrades();
        for (Map<String, Object> map : allGrades){
            Grade grade=new Grade();
            grade.setGradeCode(Integer.parseInt(map.get("gradecode").toString()));
            grade.setGradeName(map.get("gradename").toString());
            list.add(grade);
        }
        return list;
    }
}
