package com.example.admin.testsoapparsing.network.model.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

/**
 * Created by ADMIN on 5/11/2018.
 */

@Root(name = "soap:Envelope")
@NamespaceList({
        @Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/", prefix = "soap"),
})
public class ResponseEnvelope {

    @Element(required = false, name = "soap:Body")
    private DataResponseBody body;

    public DataResponseBody getBody() {
        return body;
    }

    public void setBody(DataResponseBody body) {
        this.body = body;
    }
}
