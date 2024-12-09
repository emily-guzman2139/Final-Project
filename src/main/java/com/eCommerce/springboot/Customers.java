package com.eCommerce.springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="customer")
public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="ID")
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Phone")
	private String phone;
	
	@Column(name="Date")
	private String bookingDate;
	
	@Column(name="Time")
	private String bookingTime;
	
	@Column(name="Guest")
	private int numOfGuest;

	public Customers () {
		super();
	}
	
	
	
	public Customers(Long id, String name, String email, String phone, String bookingDate, String bookingTime,
			int numOfGuest) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.numOfGuest = numOfGuest;
	}



	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}



	public String getBookingTime() {
		return bookingTime;
	}



	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}



	public int getNumOfGuest() {
		return numOfGuest;
	}



	public void setNumOfGuest(int numOfGuest) {
		this.numOfGuest = numOfGuest;
	}



	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", bookingDate="
				+ bookingDate + ", bookingTime=" + bookingTime + ", numOfGuest=" + numOfGuest + "]";
	}



	
	
}
