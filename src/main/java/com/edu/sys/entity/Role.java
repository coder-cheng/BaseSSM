package com.edu.sys.entity;

import java.io.Serializable;

/**
 * @Auther: Mr.ch
 * @Date: 2018-11-13 09:43
 * @Description: 这个类是角色信息的实体类
 */
public class Role implements Serializable {

    private String username;
    private String password;
    private String role;
    private Integer rolelevel;

    public String getUsername() {
        return username;
    }

    public Role setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Role setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRole() {
        return role;
    }

    public Role setRole(String role) {
        this.role = role;
        return this;
    }

    public Integer getRolelevel() {
        return rolelevel;
    }

    public Role setRolelevel(Integer rolelevel) {
        this.rolelevel = rolelevel;
        return this;
    }

    @Override
    public String toString() {
        return "Role{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", rolelevel='" + rolelevel + '\'' +
                '}';
    }
}
