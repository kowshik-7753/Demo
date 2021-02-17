package com.hcl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.training.model.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {
	@Modifying
	@Query("update Plane p set p.hangerId=:status where p.planeId=:id")
	void allotHangerToPlane(int id, int status);

}
