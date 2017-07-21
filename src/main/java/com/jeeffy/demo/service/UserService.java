package com.jeeffy.demo.service;

import com.jeeffy.demo.domain.User;
import com.jeeffy.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangfeng on 2017/7/19.
 */

@Service
public class UserService {

    public static final Integer PAGE_SIZE = 3;

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findAll(User user){
        Example<User> example = Example.of(user);
        return userRepository.findAll(example);
    }

    public Page<User> findByUserDeptId(Integer deptId, Integer page){
        return userRepository.findByUserDeptId(deptId, new PageRequest(page, PAGE_SIZE));
    }
}
