package com.sapient.kafkaconsumer.kafkaconsumer.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sapient.kafkaproducer.kafkaproducer.model.Department;

@Service
public class KafkaConsumerController {
	
	@KafkaListener(topics = "test_example_kafka", groupId = "group_id")
	public void consumer(Department message) {
		System.out.println("Recived Message" + message);
	}
	

}
