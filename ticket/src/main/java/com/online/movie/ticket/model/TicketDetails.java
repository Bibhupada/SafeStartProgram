package com.online.movie.ticket.model;

import java.util.Date;
import java.util.List;

public class TicketDetails {
	private double ticketId;
	private Date ticketGenTime;
	private String ticketStatus;
	private String ticketPrice;
	private String movieName;
	private String movieTime;
	private String theaterName;
	private String theaterAdress;
	private List<Seat> seat;
	public TicketDetails() {
		
	}
	
	public TicketDetails(double ticketId, Date ticketGenTime, String ticketStatus, String ticketPrice,
			String movieName, String movieTime, String theaterName, String theaterAdress, List<Seat> seat) {
		super();
		this.ticketId = ticketId;
		this.ticketGenTime = ticketGenTime;
		this.ticketStatus = ticketStatus;
		this.ticketPrice = ticketPrice;
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.theaterName = theaterName;
		this.theaterAdress = theaterAdress;
		this.seat = seat;
	}
	public double getTicketId() {
		return ticketId;
	}
	public void setTicketId(double ticketId) {
		this.ticketId = ticketId;
	}
	public Date getTicketGenTime() {
		return ticketGenTime;
	}
	public void setTicketGenTime(Date ticketGenTime) {
		this.ticketGenTime = ticketGenTime;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterAdress() {
		return theaterAdress;
	}
	public void setTheaterAdress(String theaterAdress) {
		this.theaterAdress = theaterAdress;
	}
	public List<Seat> getSeat() {
		return seat;
	}
	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

}
