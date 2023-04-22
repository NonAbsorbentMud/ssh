package own.cfb.test.domain;

import java.io.Serializable;

public class GradeClass implements Serializable {
    private Integer gradeCode;//年级编号
    private String gradeName;//年级名称
    private Integer classCode;//班级编号
    private String className;//班级名称

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

    @Override
    public String toString() {
        return "GradeClass{" +
                "gradeCode=" + gradeCode +
                ", gradeName='" + gradeName + '\'' +
                ", classCode=" + classCode +
                ", className='" + className + '\'' +
                '}';
    }
}
