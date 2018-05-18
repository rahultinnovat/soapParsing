package com.example.admin.testsoapparsing.network.model.response;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.util.List;

/**
 * Created by ADMIN on 5/11/2018.
 */

@Root(name = "WindowTabData",strict = false)
@NamespaceList({
        @Namespace(reference = "http://idempiere.org/ADInterface/1_0", prefix = ""),
        @Namespace(reference = "5", prefix = "numRows"),
        @Namespace(reference = "10", prefix = "totalRows"),
        @Namespace(reference = "15", prefix = "startRow")
})
public class WindowTabData {

    @Attribute(name = "NumRows",required = false)
    private int numRows = 5;

    @Attribute(name = "TotalRows",required = false)
    private int totalRows = 10;

    @Attribute(name = "StartRow",required = false)
    private int startRow = 20;

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    @Element(name = "DataSet",required = false)
    private ContentDataSet dataSet;

    @Element(name = "RowCount",required = false)
    private int rowCount;

    @Element(name = "Success",required = false)
    private boolean success;

    public ContentDataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(ContentDataSet dataSet) {
        this.dataSet = dataSet;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
