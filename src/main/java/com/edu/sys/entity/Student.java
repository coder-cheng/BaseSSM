package com.edu.sys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Auther: Mr.ch
 * @Date: 2018-11-13 16:02
 * @Description: 这个类是学员信息的实体类
 */
public class Student {

    private Integer studentid;
    private String studentname;
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String job;
    private String studentbelong;

    public Integer getStudentid() {
        return studentid;
    }

    public Student setStudentid(Integer studentid) {
        this.studentid = studentid;
        return this;
    }

    public String getStudentname() {
        return studentname;
    }

    public Student setStudentname(String studentname) {
        this.studentname = studentname;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Student setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getJob() {
        return job;
    }

    public Student setJob(String job) {
        this.job = job;
        return this;
    }

    public String getStudentbelong() {
        return studentbelong;
    }

    public Student setStudentbelong(String studentbelong) {
        this.studentbelong = studentbelong;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", job='" + job + '\'' +
                ", studentbelong='" + studentbelong + '\'' +
                '}';
    }
}
