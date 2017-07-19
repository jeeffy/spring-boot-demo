package com.jeeffy.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by jiangfeng on 2017/7/19.
 */

@Entity
@Table(name = "sys_user")
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String userAccount;
    private String userPswd;
    private Integer userDeptId;
    private String userCode;
    private String userName;
    private Integer userSex;
    private String userPhone;
    private Integer userType;
    private String userMail;
    private Integer userIsdel;
    private String userPy;
    private String userWb;
    private String userRemark;
    private Date userCreateDate;
    private Date userUpdateDate;
    private Integer userCreateUser;
    private Integer userUpdateUser;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
    public String getUserPswd() {
        return userPswd;
    }
    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd;
    }
    public Integer getUserDeptId() {
        return userDeptId;
    }
    public void setUserDeptId(Integer userDeptId) {
        this.userDeptId = userDeptId;
    }
    public String getUserCode() {
        return userCode;
    }
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserSex() {
        return userSex;
    }
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public Integer getUserType() {
        return userType;
    }
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    public String getUserMail() {
        return userMail;
    }
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
    public Integer getUserIsdel() {
        return userIsdel;
    }
    public void setUserIsdel(Integer userIsdel) {
        this.userIsdel = userIsdel;
    }
    public String getUserPy() {
        return userPy;
    }
    public void setUserPy(String userPy) {
        this.userPy = userPy;
    }
    public String getUserWb() {
        return userWb;
    }
    public void setUserWb(String userWb) {
        this.userWb = userWb;
    }
    public String getUserRemark() {
        return userRemark;
    }
    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }
    public Date getUserCreateDate() {
        return userCreateDate;
    }
    public void setUserCreateDate(Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
    public Date getUserUpdateDate() {
        return userUpdateDate;
    }
    public void setUserUpdateDate(Date userUpdateDate) {
        this.userUpdateDate = userUpdateDate;
    }
    public Integer getUserCreateUser() {
        return userCreateUser;
    }
    public void setUserCreateUser(Integer userCreateUser) {
        this.userCreateUser = userCreateUser;
    }
    public Integer getUserUpdateUser() {
        return userUpdateUser;
    }
    public void setUserUpdateUser(Integer userUpdateUser) {
        this.userUpdateUser = userUpdateUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
