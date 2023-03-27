package com.silence.user.infrastructure.repository.DO;



/**
 *  UserDO
 *
 * @author leo
 * @version 1.1.0
 * @date 2022/1/17
 */
public class UserDO {
    private Long id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
