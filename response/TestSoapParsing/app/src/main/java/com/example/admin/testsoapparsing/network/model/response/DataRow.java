package com.example.admin.testsoapparsing.network.model.response;

import com.example.admin.testsoapparsing.network.model.request.FieldData;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by ADMIN on 5/11/2018.
 */

@Root(name = "DataRow", strict = false)
public class DataRow {

    @ElementList(name = "field", required = false)
    private List<FieldDataResponse> fieldData;

    public List<FieldDataResponse> getFieldData() {
        return fieldData;
    }

    public void setFieldData(List<FieldDataResponse> fieldData) {
        this.fieldData = fieldData;
    }
}
