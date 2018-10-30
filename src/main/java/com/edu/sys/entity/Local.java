package com.edu.sys.entity;

import java.io.Serializable;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:31
 * @Description:
 */
public class Local implements Serializable {

    private Integer localid;
    private String localname;
    private String locallevel;
    private String localbelong;

    public Integer getLocalid() {
        return localid;
    }

    public void setLocalid(Integer localid) {
        this.localid = localid;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    public String getLocallevel() {
        return locallevel;
    }

    public void setLocallevel(String locallevel) {
        this.locallevel = locallevel;
    }

    public String getLocalbelong() {
        return localbelong;
    }

    public void setLocalbelong(String localbelong) {
        this.localbelong = localbelong;
    }

    @Override
    public String toString() {
        return "Local{" +
                "localid=" + localid +
                ", localname='" + localname + '\'' +
                ", locallevel='" + locallevel + '\'' +
                ", localbelong='" + localbelong + '\'' +
                '}';
    }
}
