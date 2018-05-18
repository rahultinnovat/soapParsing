package com.example.admin.testsoapparsing.network.model.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by ADMIN on 5/11/2018.
 */

@Root(name = "_0:ADLoginRequest", strict = false)
public class ADLoginRequest {

    @Element(name = "_0:user", required = false)
    private String user;

    @Element(name = "_0:pass", required = false)
    private String pass;

    @Element(name = "_0:lang", required = false)
    private String lang;

    @Element(name = "_0:ClientID", required = false)
    private String ClientID;

    @Element(name = "_0:RoleID", required = false)
    private String RoleID;

    @Element(name = "_0:OrgID", required = false)
    private String OrgID;

    @Element(name = "_0:WarehouseID", required = false)
    private String WarehouseID;

    @Element(name = "_0:stage", required = false)
    private String stage;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String roleID) {
        RoleID = roleID;
    }

    public String getOrgID() {
        return OrgID;
    }

    public void setOrgID(String orgID) {
        OrgID = orgID;
    }

    public String getWarehouseID() {
        return WarehouseID;
    }

    public void setWarehouseID(String warehouseID) {
        WarehouseID = warehouseID;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
