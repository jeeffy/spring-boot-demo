package com.jeeffy.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeffy.demo.bean.Bill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BillDao extends JpaRepository<Bill, Integer>{
	@Query("select b from Bill b where b.user.username = :username")
    List<Bill> findByUsername(@Param("username") String username);
}