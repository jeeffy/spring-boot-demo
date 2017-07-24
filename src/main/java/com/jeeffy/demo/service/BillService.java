package com.jeeffy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeeffy.demo.dao.BillDao;
import com.jeeffy.demo.bean.Bill;

@Service
public class BillService {
    @Autowired
	private BillDao billDao;
	
	public List<Bill> get(Bill bill) {
	    Example<Bill> example = Example.of(bill);
        return billDao.findAll(example);
	}
	
	public Bill getById(Integer billId) {
		return billDao.findOne(billId);
	}

	@Transactional
	public Bill save(Bill bill) {
		billDao.save(bill);
		return bill;
	}

	@Transactional
	public int delete(Integer billId) {
		billDao.delete(billId);
		return 1;
	}
    
}