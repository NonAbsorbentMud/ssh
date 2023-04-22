package own.cfb.test.model;

import java.io.Serializable;
import java.util.Set;

public class Grade implements Serializable {

    private Integer gradeCode;//年级编号
    private String gradeName;//年级名称
    private Set<Classes> classes;//班级列表

    public Integer getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(Integer gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Set<Classes> getClasses() {
        return classes;
    }

    public void setClasses(Set<Classes> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeCode=" + gradeCode +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
