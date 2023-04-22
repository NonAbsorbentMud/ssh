package own.cfb.test.action;

import com.opensymphony.xwork2.ModelDriven;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import own.cfb.test.domain.ModelParam;
import own.cfb.test.domain.ObjectParam;

import java.util.List;
import java.util.Map;

public class ParamAction implements ModelDriven<ModelParam> {
    protected Logger logger= LoggerFactory.getLogger(getClass());
    //属性驱动
    private String fieldParam;
    public void setFieldParam(java.lang.String fieldParam) {
        this.fieldParam = fieldParam;
    }
    //对象驱动
    private ObjectParam objectParam;
    public void setObjectParam(ObjectParam objectParam) {
        this.objectParam = objectParam;
    }
    //List集合
    private List<String> fieldList;
    public void setFieldList(List<String> fieldList) {
        this.fieldList = fieldList;
    }
    public List<String> getFieldList() {
        return fieldList;
    }
    //Map集合
    private Map<String,Integer> fieldMap;
    public void setFieldMap(Map<String, Integer> fieldMap) {
        this.fieldMap = fieldMap;
    }
    //模型驱动
    private ModelParam modelParam=new ModelParam();
    @Override
    public ModelParam getModel() {
        return modelParam;
    }
    public String param(){
        logger.info("属性驱动：{}",this.fieldParam);
        logger.info("对象驱动：{}",this.objectParam.getField());
        logger.info("模型驱动：{}", this.modelParam.getFieldModel());
        logger.info("List集合：{}", this.fieldList.toString());
        logger.info("Map集合：{}", this.fieldMap.get('a'));
        return "param";
    }
}
