package own.cfb.test.dao;

import own.cfb.test.model.Grade;
import own.cfb.test.model.TestTable;

import java.util.List;
import java.util.Map;

public interface TestDao {

    public List<Map<String, Object>> getAllGrades();
}
