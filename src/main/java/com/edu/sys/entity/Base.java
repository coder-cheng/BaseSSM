package com.edu.sys.entity;

import java.io.Serializable;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:31
 * @Description: 这个类是基地信息的实体类
 */
public class Base implements Serializable {

    private Integer baseid;
    private String basename;
    private String baselevel;
    private String basebelong;

    @Override
    public String toString() {
        return "Base{" +
                "baseid=" + baseid +
                ", basename='" + basename + '\'' +
                ", baselevel='" + baselevel + '\'' +
                ", basebelong='" + basebelong + '\'' +
                '}';
    }

    public Integer getBaseid() {
        return baseid;
    }

    public Base setBaseid(Integer baseid) {
        this.baseid = baseid;
        return this;
    }

    public String getBasename() {
        return basename;
    }

    public Base setBasename(String basename) {
        this.basename = basename;
        return this;
    }

    public String getBaselevel() {
        return baselevel;
    }

    public Base setBaselevel(String baselevel) {
        this.baselevel = baselevel;
        return this;
    }

    public String getBasebelong() {
        return basebelong;
    }

    public Base setBasebelong(String basebelong) {
        this.basebelong = basebelong;
        return this;
    }
}
