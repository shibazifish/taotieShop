package com.taotieshop.demo.entity;

public class Admin {
    private Integer id;

    private String username;

    private String password;

    private String password_salt;

    private String last_login_ip;

    private Integer last_login_time;

    private Integer add_time;

    private Integer update_time;

    private String avatar;

    private Integer admin_role_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_salt() {
        return password_salt;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public Integer getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Integer last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Integer getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }

    public Integer getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Integer update_time) {
        this.update_time = update_time;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getAdmin_role_id() {
        return admin_role_id;
    }

    public void setAdmin_role_id(Integer admin_role_id) {
        this.admin_role_id = admin_role_id;
    }
}