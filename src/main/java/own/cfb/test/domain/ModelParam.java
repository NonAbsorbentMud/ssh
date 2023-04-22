package own.cfb.test.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ModelParam implements Serializable {
    private String fieldModel;

    public String getFieldModel() {
        return fieldModel;
    }

    public void setFieldModel(String fieldModel) {
        this.fieldModel = fieldModel;
    }
}
