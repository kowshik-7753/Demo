package com.hcl.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "manager")
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String firstName;
	String lastName;
	int age;
	String gender;
	String contactNumber;
	String managerId;
	String password;
}
