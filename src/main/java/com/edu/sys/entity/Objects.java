package com.edu.sys.entity;

import java.io.Serializable;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:31
 * @Description: 这个类是专业信息的实体类
 */
public class Objects implements Serializable {

    private Integer objectid;
    private String objectname;
    private String objectlevel;
    private String objectbelong;

    public Integer getObjectid() {
        return objectid;
    }

    public java.lang.Object setObjectid(Integer objectid) {
        this.objectid = objectid;
        return this;
    }

    public String getObjectname() {
        return objectname;
    }

    public java.lang.Object setObjectname(String objectname) {
        this.objectname = objectname;
        return this;
    }

    public String getObjectlevel() {
        return objectlevel;
    }

    public java.lang.Object setObjectlevel(String objectlevel) {
        this.objectlevel = objectlevel;
        return this;
    }

    public String getObjectbelong() {
        return objectbelong;
    }

    public java.lang.Object setObjectbelong(String objectbelong) {
        this.objectbelong = objectbelong;
        return this;
    }

    @Override
    public String toString() {
        return "Objects{" +
                "objectid=" + objectid +
                ", objectname='" + objectname + '\'' +
                ", objectlevel='" + objectlevel + '\'' +
                ", objectbelong='" + objectbelong + '\'' +
                '}';
    }
}
