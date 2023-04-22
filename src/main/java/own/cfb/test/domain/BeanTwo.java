package own.cfb.test.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanTwo implements Serializable {

    private Integer id;
    private String name;
    private List<String> strList;
    private Set<String> strSet;
    private Map<Integer,String> map;
    private Properties properties;
    private BeanOne beanOne;

    public BeanOne getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(BeanOne beanOne) {
        this.beanOne = beanOne;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Set<String> getStrSet() {
        return strSet;
    }

    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destroy(){
        System.out.println("销毁");
    }
    public String printTwo() {
        return "BeanTwo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", strList=" + strList.toString() +
                ", strSet=" + strSet.toString() +
                ", map=" + map.toString() +
                ", properties=" + properties.toString() +
                ", beanOne=" + beanOne.printOne() +
                '}';
    }
}
