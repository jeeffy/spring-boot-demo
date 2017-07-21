package com.jeeffy.demo.bean;



public class User {
	private Integer id;
	private Integer deptId;
	private String account;
	private String username;
	private Integer male;
	private String phone;
	private String mail;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getMale() {
		return male;
	}
	public void setMale(Integer male) {
		this.male = male;
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
	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", deptId=" + deptId +
			", account=" + account +
			", username=" + username +
			", male=" + male +
			", phone=" + phone +
			", mail=" + mail +
			'}';
		}
}