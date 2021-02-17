package com.hcl.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.model.Hanger;
import com.hcl.training.service.ServiceInf;

@RestController
@RequestMapping("/airport")
public class HangerController {
	@Autowired
	ServiceInf service;

	@PostMapping("/saveHanger")
	public @ResponseBody String saveHanger(@RequestBody Hanger hanger) {
		service.saveHanger(hanger);
		return "{\"msg\":\"Hanger Details Added Successfully\"}";
	}

	@GetMapping(value = "/getHangers")
	public List<Hanger> getHangers() {
		List<Hanger> ls = service.getHangers();
		return ls;
	}

	@GetMapping(value = "/getHanger/{id}")
	public Optional<Hanger> getHangerById(@PathVariable int id) {
		return service.getHangerById(id);
	}

	@PutMapping(value = "/allotHanger/{id}")
	public @ResponseBody String allotHanger(@PathVariable int id) {
		return service.allotHanger(id);
	}
}
