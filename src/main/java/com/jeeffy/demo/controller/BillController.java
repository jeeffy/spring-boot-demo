package com.jeeffy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jeeffy.demo.bean.Bill;
import com.jeeffy.demo.service.BillService;

@RequestMapping(value = "/bills")
@RestController
public class BillController {
	
	@Autowired
	private BillService billService;
	
	
	@GetMapping
    public List<Bill> list(Bill bill) {
		return billService.get(bill);
    }
	
	@GetMapping("/{id}")
    public Bill detail(@PathVariable Integer billId) {
		return billService.getById(billId);
    }
    
    @PostMapping
    public Bill save(Bill bill) {
		return billService.save(bill);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer billId) {
		return billService.delete(billId);
    }
    
}