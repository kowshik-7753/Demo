package com.hcl.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.model.Pilot;
import com.hcl.training.model.Plane;
import com.hcl.training.service.ServiceInf;

@RestController
@RequestMapping("/airport")
public class PlaneController {
	@Autowired
	ServiceInf service;

	@PostMapping("/savePlane")
	public @ResponseBody String savePlane(@RequestBody Plane plane) {
		service.savePlane(plane);
		return "{\"msg\":\"Plane Details Added Successfully\"}";
	}

	@GetMapping(value = "/getPlanes")
	public List<Plane> getPlanes() {
		List<Plane> ls = service.getPlanes();
		return ls;
	}

	
}
