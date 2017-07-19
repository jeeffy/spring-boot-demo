package com.jeeffy.demo.repository;

import com.jeeffy.demo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jiangfeng on 2017/7/19.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    Page<User> findByUserDeptId(Integer deptId, Pageable pageable);
}
