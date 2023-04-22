package own.cfb.test.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//创建Action方式1：普通类POJO
public class CreateActionOne {
    protected Logger logger= LoggerFactory.getLogger(this.getClass());
    public String one(){
        return "one";
    }
}
