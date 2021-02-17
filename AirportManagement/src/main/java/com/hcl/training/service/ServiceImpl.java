package com.hcl.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.training.model.Admin;
import com.hcl.training.model.Hanger;
import com.hcl.training.model.Manager;
import com.hcl.training.model.Pilot;
import com.hcl.training.model.Plane;
import com.hcl.training.repository.AdminRepository;
import com.hcl.training.repository.HangerRepository;
import com.hcl.training.repository.ManagerRepository;
import com.hcl.training.repository.PilotRepository;
import com.hcl.training.repository.PlaneRepository;

@Transactional
@Service
public class ServiceImpl implements ServiceInf{
@Autowired
AdminRepository adminRepo;
@Autowired
ManagerRepository managerRepo;
@Autowired
PlaneRepository planeRepo;
@Autowired
PilotRepository pilotRepo;
@Autowired
HangerRepository hangerRepo;
	@Override
	public void saveAdmin(Admin admin) {
		
		adminRepo.save(admin);
	}

	@Override
	public void saveManager(Manager manager) {
		
		managerRepo.save(manager);
	}

	@Override
	public void savePlane(Plane plane) {
		planeRepo.save(plane);
		
	}

	@Override
	public void savePilot(Pilot pilot) {
		
		pilotRepo.save(pilot);
	}

	@Override
	public void saveHanger(Hanger hanger) {
		
		hangerRepo.save(hanger);
	}

	@Override
	public List<Plane> getPlanes() {
		List<Plane>ls=planeRepo.findAll();
		return ls;
	}

	

	@Override
	public List<Hanger> getHangers() {
		
		List<Hanger>ls=hangerRepo.findAll();
		return ls;
	}

	@Override
	public List<Pilot> getPilot() {
		List<Pilot>ls=pilotRepo.findAll();
		return ls;
	}

	@Override
	public Optional<Hanger> getHangerById(int id) {
		
		return hangerRepo.findById(id);
	}

	@Override
	public String allotHanger(int id) {
	List<Hanger>ls=hangerRepo.findAll();
	int hanger=0;
	for(Hanger str:ls) {
		if(str.getStatus().equalsIgnoreCase("Available")){
		 hanger = str.getHangerId();
		 break;
		}
	}
	if(hanger>0) {
		planeRepo.allotHangerToPlane(id,hanger);
		String status="Not Available";
		hangerRepo.allotStatusToHanger(hanger,status);
		return "Hanger successfully alloted";
	}
	else
		return "No Hangers are available";
	}

}
