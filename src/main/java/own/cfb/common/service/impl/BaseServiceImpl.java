package own.cfb.common.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import own.cfb.common.dao.BaseDao;
import own.cfb.common.service.BaseService;

public class BaseServiceImpl implements BaseService {
    protected Logger logger= LoggerFactory.getLogger(this.getClass());
    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }
}
