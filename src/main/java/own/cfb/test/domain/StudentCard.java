package own.cfb.test.domain;

import java.io.Serializable;

public class StudentCard implements Serializable {
    private Integer stuCode;//学生编号
    private String stuName;//学生名称
    private Integer cardCode;//卡号
    private Double value;//金额

    public Integer getStuCode() {
        return stuCode;
    }

    public void setStuCode(Integer stuCode) {
        this.stuCode = stuCode;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getCardCode() {
        return cardCode;
    }

    public void setCardCode(Integer cardCode) {
        this.cardCode = cardCode;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StudentCard{" +
                "stuCode=" + stuCode +
                ", stuName='" + stuName + '\'' +
                ", cardCode=" + cardCode +
                ", value=" + value +
                '}';
    }
}
