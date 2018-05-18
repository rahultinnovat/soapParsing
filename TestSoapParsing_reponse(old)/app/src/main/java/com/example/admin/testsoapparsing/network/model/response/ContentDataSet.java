package com.example.admin.testsoapparsing.network.model.response;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by ADMIN on 5/11/2018.
 */

@Root(name = "DataSet",strict = false)
public class ContentDataSet {

    @ElementList(name = "DataRow",required = false)
    private List<DataRow> dataRowList;

    public List<DataRow> getDataRowList() {
        return dataRowList;
    }

    public void setDataRowList(List<DataRow> dataRowList) {
        this.dataRowList = dataRowList;
    }
}
