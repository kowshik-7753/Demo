package com.hcl.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hcl.training.model.Pilot;
import com.hcl.training.model.Plane;
import com.hcl.training.service.ServiceInf;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AirportManagementApplicationTests {

	@Test
	void contextLoads() {
	}
	Plane p;
	Pilot p1;
	@Autowired
	ServiceInf service;
	@BeforeEach
	public void setUp() {
		p=new Plane();
		p1=new Pilot();
	}
	
	@Test
	public void testPlane() {
		p.setPlaneName("kkk");
		p.setHangerId(3);
		service.savePlane(p);
		
	}
	@Test
	public void testPlanes() {
		service.getPlanes();
	}
	@Test
	public void testHangerById() {
		service.getHangerById(1);
	}
	@Test
	public void testPilot() {
		p1.setPilotName("kowshik");
		service.savePilot(p1);
	}

}
