package com.hcl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.model.Pilot;

@Repository
public interface PilotRepository extends JpaRepository< Pilot , Integer> {

}
