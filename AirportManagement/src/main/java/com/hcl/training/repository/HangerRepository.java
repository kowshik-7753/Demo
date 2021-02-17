package com.hcl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.training.model.Hanger;

@Repository
public interface HangerRepository extends JpaRepository< Hanger , Integer> {
	@Modifying
	@Query("update Hanger h set h.Status=:status where h.hangerId=:hanger")
	void allotStatusToHanger(int hanger, String status);

}
