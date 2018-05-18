package com.example.admin.testsoapparsing.network.model.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

/**
 * Created by ADMIN on 5/11/2018.
 */

@Root(name = "ns1:queryDataResponse", strict = false) @NamespaceList({
        @Namespace(reference = "http://idempiere.org/ADInterface/1_0", prefix = "ns1"),
})
public class ResponseData {

    @Element(name = "WindowTabData", required = false)
    private WindowTabData data;

    public WindowTabData getData() {
        return data;
    }

    public void setData(WindowTabData data) {
        this.data = data;
    }
}
