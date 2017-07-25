package com.jeeffy.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeffy.demo.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer>{

    User findByUsername(String username);

    @Query("from User u where u.deptId = :deptId and id<112")
    List<User> findByDeptId(@Param("deptId") Integer deptId);
}