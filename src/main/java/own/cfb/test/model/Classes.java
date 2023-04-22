package own.cfb.test.model;

import java.io.Serializable;
import java.util.Set;

public class Classes implements Serializable{

    private Integer classCode;//班级编号
    private String className;//班级名称
    private Set<Grade> grades;//年级列表

    public Integer getClassCode() {
        return classCode;
    }

    public void setClassCode(Integer classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classCode=" + classCode +
                ", className='" + className + '\'' +
                '}';
    }
}
