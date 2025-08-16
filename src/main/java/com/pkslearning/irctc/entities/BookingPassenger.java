package com.pkslearning.irctc.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="passengers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingPassenger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="booking_id")
	private Booking booking;
	
	private String name;
	
	private String gender;
	
	private Integer age;
	
	private String seatNumber;
}
