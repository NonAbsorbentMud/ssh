package own.cfb.test.dao.impl;


import org.springframework.jdbc.core.support.JdbcDaoSupport;
import own.cfb.test.dao.TestDao;
import java.util.List;
import java.util.Map;

public class TestDaoImpl extends JdbcDaoSupport implements TestDao {

    @Override
    public List<Map<String, Object>> getAllGrades() {
        String sql="select * from Grade";
        List<Map<String, Object>> maps = super.getJdbcTemplate().queryForList(sql);
        return maps;
    }
}
