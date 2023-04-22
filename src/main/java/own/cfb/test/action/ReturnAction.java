package own.cfb.test.action;

import org.apache.struts2.ServletActionContext;
import own.cfb.utils.JsonUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnAction {
    public String retStr(){
        return "str";
    }

    public void retVoid(){

    }

    public String retJson(){
        Map<String, Object> map = new HashMap<String, Object>();
        List list=new ArrayList();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        map.put("result",list);
        map.put("code",0);
        try {
            JsonUtil.toJson(ServletActionContext.getResponse(),map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "retJson";
    }
    private Map<String,Object> jsonResult;

    public Map<String, Object> getJsonResult() {
        return jsonResult;
    }

    public void setJsonResult(Map<String, Object> jsonResult) {
        this.jsonResult = jsonResult;
    }

    public String retJsonData(){
        Map<String, Object> map = new HashMap<String, Object>();
        List list=new ArrayList();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        map.put("result",list);
        map.put("code",0);
        jsonResult=map;
        return "retJsonData";
    }
}
