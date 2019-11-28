package com.online.movie.ticket.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.online.movie.ticket.model.MovieDetails;
import com.online.movie.ticket.model.Seat;
import com.online.movie.ticket.model.TicketDetails;


@Service
public class TicketController {
	
	final private String TOPIC="ticket_details_topic";
	
	Map<String,String> ticketDetails= new HashMap();
	Map<String,List<Seat>> seatDetails= new HashMap();
	
	@Autowired
	private KafkaTemplate<String,TicketDetails> kafkaTemplate;

	
	/**
	 * This is used to get Movie details from kafka queue.
	 * 
	 */
	@KafkaListener(topics = "test_example_kafka", groupId = "group_id")
	public void movieDetailReciver(MovieDetails movieDetails) {
		storeDetails(movieDetails);
	}
	
	/**
	 * This method is used to publish ticket to kafka queue.
	 * 
	 */
    public String ticketPublisher() {
    	double ticketId = Math.random();
    	Date ticketGenTime = Calendar.getInstance().getTime();  
    	kafkaTemplate.send(TOPIC,new TicketDetails(ticketId,ticketGenTime,
    			ticketDetails.get("ticketStatus"),ticketDetails.get("ticketPrice"),
    			ticketDetails.get("movieName"),ticketDetails.get("movieTime"),
    			ticketDetails.get("theaterName"),ticketDetails.get("theaterAdress"),
    			seatDetails.get("seat")));
    	return "publich successfully";
    }
    
    /**
     * This method is used to store Movie details.
     * @param movieDetails
     */
    private void storeDetails(MovieDetails movieDetails) {
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    	String movieTime= dateFormat.format(movieDetails.getMovie().getDate());
    	ticketDetails.put("ticketStatus","SUCCESS");
    	ticketDetails.put("ticketPrice", Integer.toString(movieDetails.getTotalBill()));
    	ticketDetails.put("movieName", movieDetails.getMovie().getName());
    	ticketDetails.put("movieTime", movieTime);
    	ticketDetails.put("theaterName", movieDetails.getMovie().getTheater().getName());
    	ticketDetails.put("theaterAdress",movieDetails.getMovie().getTheater().getAddress());
    	seatDetails.put("seat",movieDetails.getSeat());
    	
    }

}
