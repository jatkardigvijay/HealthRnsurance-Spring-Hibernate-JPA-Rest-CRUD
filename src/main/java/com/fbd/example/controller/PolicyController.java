package com.fbd.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fbd.example.entity.Policy;
import com.fbd.example.service.PolicyService;

@RestController
public class PolicyController {

	@Autowired
	private PolicyService service;

	@PostMapping("/addPlan")
	public Policy addPlan(@RequestBody Policy policy) {
		return service.savePolicy(policy);
	}

	@PostMapping("/addPlans")
	public List<Policy> addPlans(@RequestBody List<Policy> policies) {
		return service.savePolicies(policies);
	}

	@GetMapping("getPlanById/{id}")
	public Policy getPlanByPolicyId(@PathVariable int id) {
		return service.getPlanById(id);
	}

	@GetMapping("getPlanByName/{name}")
	public Policy getPlanByPolicyName(@PathVariable String name) {
		return service.getPlanByName(name);
	}

	@GetMapping("/getPlans")
	public List<Policy> getAllPlans() {
		return service.getAllPolicies();
	}

	@DeleteMapping("/delete/{id}")
	public String deletePlan(@PathVariable int id) {
		return service.deletePolicy(id);

	}

	@PutMapping("/update")
	public Policy updatePlan(@RequestBody Policy policy) {
		return service.updatePolicy(policy);
	}

}
