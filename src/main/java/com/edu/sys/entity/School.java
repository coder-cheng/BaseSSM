package com.edu.sys.entity;

import java.io.Serializable;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:31
 * @Description: 这个类是学校信息的实体类
 */
public class School implements Serializable {

    private Integer schoolid;
    private String schoolname;
    private String schoollevel;
    private String schoolbelong;

    public Integer getSchoolid() {
        return schoolid;
    }

    public School setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
        return this;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public School setSchoolname(String schoolname) {
        this.schoolname = schoolname;
        return this;
    }

    public String getSchoollevel() {
        return schoollevel;
    }

    public School setSchoollevel(String schoollevel) {
        this.schoollevel = schoollevel;
        return this;
    }

    public String getSchoolbelong() {
        return schoolbelong;
    }

    public School setSchoolbelong(String schoolbelong) {
        this.schoolbelong = schoolbelong;
        return this;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolid=" + schoolid +
                ", schoolname='" + schoolname + '\'' +
                ", schoollevel='" + schoollevel + '\'' +
                ", schoolbelong='" + schoolbelong + '\'' +
                '}';
    }
}
