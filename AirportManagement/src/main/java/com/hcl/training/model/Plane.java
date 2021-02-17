package com.hcl.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Plane")
public class Plane {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int planeId;
	String planeName;
	int hangerId;

}
