package com.fbd.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "policy_tbl")
public class Policy {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int policyId;
	private String policyName;
	private int amountPerMonth;
	private double coverage;
}