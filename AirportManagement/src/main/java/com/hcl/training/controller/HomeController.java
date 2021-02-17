package com.hcl.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.model.Admin;
import com.hcl.training.model.Manager;
import com.hcl.training.service.ServiceInf;

@RestController
@RequestMapping("/airport")
public class HomeController {
	@Autowired
	ServiceInf service;

	@PostMapping("/saveAdmin")
	public @ResponseBody String saveAdmin(@RequestBody Admin admin) {
		service.saveAdmin(admin);
		return "{\"msg\":\" Admin Details Added Successfully\"}";
	}

	@PostMapping("/saveManager")
	public @ResponseBody String saveManager(@RequestBody Manager manager) {
		service.saveManager(manager);
		return "{\"msg\":\"Manager Details Added Successfully\"}";
	}

}
