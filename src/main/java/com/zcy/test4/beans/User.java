package com.zcy.test4.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zcy on 2017/6/18.
 */
@Entity
@Table(name = "user")
public class User {
    private Integer id;
    private String username;
    private String password;
    private  String age;

    @Column
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
