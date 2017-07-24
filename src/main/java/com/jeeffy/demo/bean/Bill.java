package com.jeeffy.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import java.util.Date;
import javax.persistence.Id;


@Entity
@Table(name = "biz_bill")
public class Bill{
	@Id
	@GeneratedValue
	private Integer billId;
	private String billDjhm;
	private Integer billType;
	private Integer tlId;
	private Integer cfId;
	private Date billRectifyDate;
	private Integer totalCount;
	private Integer finishCount;
	private Date billFinishDate;
	private Integer billIsdel;
	private Date billCreateDate;
	private Date billUpdateDate;
	private Integer billCreateUser;
	private Integer billUpdateUser;
	private Integer websiteId;
	private Integer billStatus;
	private String billCreateTbdw;

	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getBillDjhm() {
		return billDjhm;
	}
	public void setBillDjhm(String billDjhm) {
		this.billDjhm = billDjhm;
	}
	public Integer getBillType() {
		return billType;
	}
	public void setBillType(Integer billType) {
		this.billType = billType;
	}
	public Integer getTlId() {
		return tlId;
	}
	public void setTlId(Integer tlId) {
		this.tlId = tlId;
	}
	public Integer getCfId() {
		return cfId;
	}
	public void setCfId(Integer cfId) {
		this.cfId = cfId;
	}
	public Date getBillRectifyDate() {
		return billRectifyDate;
	}
	public void setBillRectifyDate(Date billRectifyDate) {
		this.billRectifyDate = billRectifyDate;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getFinishCount() {
		return finishCount;
	}
	public void setFinishCount(Integer finishCount) {
		this.finishCount = finishCount;
	}
	public Date getBillFinishDate() {
		return billFinishDate;
	}
	public void setBillFinishDate(Date billFinishDate) {
		this.billFinishDate = billFinishDate;
	}
	public Integer getBillIsdel() {
		return billIsdel;
	}
	public void setBillIsdel(Integer billIsdel) {
		this.billIsdel = billIsdel;
	}
	public Date getBillCreateDate() {
		return billCreateDate;
	}
	public void setBillCreateDate(Date billCreateDate) {
		this.billCreateDate = billCreateDate;
	}
	public Date getBillUpdateDate() {
		return billUpdateDate;
	}
	public void setBillUpdateDate(Date billUpdateDate) {
		this.billUpdateDate = billUpdateDate;
	}
	public Integer getBillCreateUser() {
		return billCreateUser;
	}
	public void setBillCreateUser(Integer billCreateUser) {
		this.billCreateUser = billCreateUser;
	}
	public Integer getBillUpdateUser() {
		return billUpdateUser;
	}
	public void setBillUpdateUser(Integer billUpdateUser) {
		this.billUpdateUser = billUpdateUser;
	}
	public Integer getWebsiteId() {
		return websiteId;
	}
	public void setWebsiteId(Integer websiteId) {
		this.websiteId = websiteId;
	}
	public Integer getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(Integer billStatus) {
		this.billStatus = billStatus;
	}
	public String getBillCreateTbdw() {
		return billCreateTbdw;
	}
	public void setBillCreateTbdw(String billCreateTbdw) {
		this.billCreateTbdw = billCreateTbdw;
	}
}