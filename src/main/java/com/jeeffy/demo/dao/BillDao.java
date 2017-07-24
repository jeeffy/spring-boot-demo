package com.jeeffy.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeffy.demo.bean.Bill;

public interface BillDao extends JpaRepository<Bill, Integer>{
	
}