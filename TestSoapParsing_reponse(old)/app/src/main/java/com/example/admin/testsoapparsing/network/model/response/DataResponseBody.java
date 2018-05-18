package com.example.admin.testsoapparsing.network.model.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

/**
 * Created by ADMIN on 5/11/2018.
 */

@Root(name = "soap:Body", strict = false)
public class DataResponseBody {

    @Element(name = "ns1:queryDataResponse", required = false)
    private ResponseData data;

    public ResponseData getData() {
        return data;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }
}
