package com.jeeffy.demo.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class User{

    private Integer id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("用户类型")
    private String type;
    @ApiModelProperty("电话号码")
    private String phone;
    @ApiModelProperty("邮箱")
    private String mail;
    @ApiModelProperty("角色列表")
    private String roles;
    @ApiModelProperty("头像")
    private String avatar;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("备注")
    private String remark;
    private Date createTime;
    private Date updateTime;

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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id + ", " +
            "username=" + username + ", " +
            "password=" + password + ", " +
            "type=" + type + ", " +
            "phone=" + phone + ", " +
            "mail=" + mail + ", " +
            "roles=" + roles + ", " +
            "avatar=" + avatar + ", " +
            "name=" + name + ", " +
            "remark=" + remark + ", " +
            "createTime=" + createTime + ", " +
            "updateTime=" + updateTime + ", " +
        "}";
    }
}