package com.hcl.training.service;

import java.util.List;
import java.util.Optional;

import com.hcl.training.model.Admin;
import com.hcl.training.model.Hanger;
import com.hcl.training.model.Manager;
import com.hcl.training.model.Pilot;
import com.hcl.training.model.Plane;

public interface ServiceInf {

	void saveAdmin(Admin admin);

	void saveManager(Manager manager);

	void savePlane(Plane plane);

	void savePilot(Pilot pilot);

	void saveHanger(Hanger hanger);

	List<Plane> getPlanes();

	List<Pilot> getPilot();

	List<Hanger> getHangers();

	Optional<Hanger> getHangerById(int id);

	String allotHanger(int id);

}
