package com.sapient.kafkaconsumer.kafkaconsumer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.sapient.kafkaproducer.kafkaproducer.model.Department;


@EnableKafka
@Configuration
public class KafkaConsumerConfig {
	
	@Bean
	public ConsumerFactory<String,Department> consumerFactory(){
		
		Map<String,Object> config= new HashMap<String,Object>();
		config.put(org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
		config.put(org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG,"group_id");
		config.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
		config.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,JsonDeserializer.class);
		config.put(JsonDeserializer.TRUSTED_PACKAGES,"com.sapient.kafkaproducer.kafkaproducer.model");
		return new DefaultKafkaConsumerFactory<String,Department>(config);
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory kafkaListenerContainerFactory(){
		ConcurrentKafkaListenerContainerFactory concurrentKafkaListenerContainerFactory =
				  new ConcurrentKafkaListenerContainerFactory();
		concurrentKafkaListenerContainerFactory.setConsumerFactory(consumerFactory());
		return concurrentKafkaListenerContainerFactory;
	}

}
