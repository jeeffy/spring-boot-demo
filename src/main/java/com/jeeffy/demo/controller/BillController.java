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

    @GetMapping("/username/{username}")
    public List<Bill> list(@PathVariable String username) {
        return billService.findByUsername(username);
    }

	@GetMapping("/{billId}")
    public Bill detail(@PathVariable Integer billId) {
        Bill bill = billService.getById(billId);
		return bill;
    }
    
    @PostMapping
    public Bill save(Bill bill) {
		return billService.save(bill);
    }

    @DeleteMapping("/{billId}")
    public int delete(@PathVariable Integer billId) {
		return billService.delete(billId);
    }
    
}