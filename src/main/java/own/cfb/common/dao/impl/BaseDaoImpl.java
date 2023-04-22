package own.cfb.common.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import own.cfb.common.dao.BaseDao;

public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {
    protected Logger logger= LoggerFactory.getLogger(this.getClass());
}
