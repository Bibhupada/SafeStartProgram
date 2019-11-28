package com.sapient.kafkaproducer.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.kafkaproducer.kafkaproducer.model.Department;

@RestController
public class KafkaProducerController {
	
	final private String TOPIC="test_example_kafka";
	
	/*
	 * @Autowired private KafkaTemplate<String,String> kafkaTemplate;
	 */
	
	@Autowired
	private KafkaTemplate<String,Department> kafkaTemplate1;
	
	
	/*
	 * @RequestMapping("/kafkaProducerString/{message}") public String
	 * publishMessageString(@PathVariable String message) {
	 * kafkaTemplate.send(TOPIC,message); return "publich successfully"; }
	 */
	
	@RequestMapping("/kafkaProducerDepartment/{message}")
	public String publishMessageDepartment(@PathVariable String message) {
		kafkaTemplate1.send(TOPIC,new Department(1,message,"Bhubaneswer"));
		return "publich successfully";
	}

}
