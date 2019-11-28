package com.online.movie.ticket.model;

public class Theater {
	
	private long theaterId;
	private String name;
    private String address;
    
    public long getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(long theaterId) {
		this.theaterId = theaterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
