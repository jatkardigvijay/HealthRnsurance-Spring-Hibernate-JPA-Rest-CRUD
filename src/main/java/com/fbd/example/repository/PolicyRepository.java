package com.fbd.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fbd.example.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

	Policy findByPolicyName(String name);

	

}
