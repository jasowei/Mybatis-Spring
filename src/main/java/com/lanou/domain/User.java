package com.lanou.domain;

public class User {
    private Integer id;

    private String loginname;

    private String loginpassword;

    private String gender;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", loginpassword='" + loginpassword + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public User(Integer id, String loginname, String loginpassword, String gender, Integer age) {
        this.id = id;
        this.loginname = loginname;
        this.loginpassword = loginpassword;
        this.gender = gender;
        this.age = age;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword == null ? null : loginpassword.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}