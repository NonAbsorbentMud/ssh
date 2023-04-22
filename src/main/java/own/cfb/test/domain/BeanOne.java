package own.cfb.test.domain;

import java.io.Serializable;

public class BeanOne implements Serializable {
    private Integer code;
    private String txt;

    public BeanOne(Integer code, String txt) {
        this.code = code;
        this.txt = txt;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String printOne() {
        return "BeanOne{" +
                "code=" + code +
                ", txt='" + txt + '\'' +
                '}';
    }
}
