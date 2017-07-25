package com.jeeffy.demo.dao;

import com.jeeffy.demo.bean.User2;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeffy.demo.bean.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

public interface UserDao extends JpaRepository<User, Integer>{

    User findByUsername(String username);

    /*@Query("select u.id as id, u.username as username from User u where u.deptId = :deptId and id<112")
    List<User2> findByDeptId(@Param("deptId") Integer deptId);*/

    @Query("select u.id as id, u.username as username from User u where u.deptId = :deptId and id<112")
    List<Map> findByDeptId(@Param("deptId") Integer deptId);

    void deleteByDeptId(Integer deptId);
}