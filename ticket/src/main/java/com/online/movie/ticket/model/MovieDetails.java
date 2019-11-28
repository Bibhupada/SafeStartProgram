package com.online.movie.ticket.model;

import java.util.List;
import com.online.movie.ticket.model.Movie;

public class MovieDetails {
	
	private String movieDetailsId;
	private Movie movie;
    private List<Seat> seat;
	private int totalBill;
    private Status status;
    private String paymentRef;
    
    public String getMovieDetailsId() {
		return movieDetailsId;
	}
	public void setMovieDetailsId(String movieDetailsId) {
		this.movieDetailsId = movieDetailsId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public List<Seat> getSeat() {
		return seat;
	}
	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}
	public int getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getPaymentRef() {
		return paymentRef;
	}
	public void setPaymentRef(String paymentRef) {
		this.paymentRef = paymentRef;
	}
}
