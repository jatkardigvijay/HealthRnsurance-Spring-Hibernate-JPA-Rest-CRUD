package com.fbd.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbd.example.entity.Policy;
import com.fbd.example.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository repository;

	// save single policy
	public Policy savePolicy(Policy policy) {
		return repository.save(policy);
	}

	// save multiple policies
	public List<Policy> savePolicies(List<Policy> policies) {
		return repository.saveAll(policies);
	}

	// get one policy by id
	public Policy getPlanById(int id) {
		return repository.findById(id).orElse(null);
	}

	// get one policy by name
	public Policy getPlanByName(String name) {
		return repository.findByPolicyName(name);
	}

	// get all policies
	public List<Policy> getAllPolicies() {
		return repository.findAll();
	}

	// delete policy
	public String deletePolicy(int id) {
		repository.deleteById(id);
		return "Policy removed" + id;
	}

	// update policy
	public Policy updatePolicy(Policy policy) {
		Policy existingPolicy = repository.findById(policy.getPolicyId()).orElse(policy);

		existingPolicy.setPolicyName(policy.getPolicyName());
		existingPolicy.setAmountPerMonth(policy.getAmountPerMonth());
		existingPolicy.setCoverage(policy.getCoverage());

		return repository.save(existingPolicy);
	}

}
