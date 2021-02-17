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
@Table(name="Hanger")
public class Hanger {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int hangerId;
String hangerName;
String Status;
}
