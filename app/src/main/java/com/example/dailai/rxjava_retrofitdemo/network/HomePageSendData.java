package com.example.dailai.rxjava_retrofitdemo.network;

/**
 * Created by dailai on 2017/7/6.
 */

public class HomePageSendData {
    private String whereJson;
    private String operateType;
    private String functionType;
    private String datatype;
    private String json;

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public String getWhereJson() {
        return whereJson;
    }

    public void setWhereJson(String whereJson) {
        this.whereJson = whereJson;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }
}
