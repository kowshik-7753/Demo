package com.hcl.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.model.Pilot;
import com.hcl.training.service.ServiceInf;

@RestController
@RequestMapping("/airport")
public class PilotController {
	@Autowired
	ServiceInf service;

	@PostMapping("/savePilot")
	public @ResponseBody String savePilot(@RequestBody Pilot pilot) {
		service.savePilot(pilot);
		return "{\"msg\":\" Pilot Details Added Successfully\"}";
	}

}
