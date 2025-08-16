package com.pkslearning.irctc.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.autoconfigure.cache.CacheType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String pnr;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
		
	@ManyToOne
	@JoinColumn(name="train_schedule_id")
	private TrainSchedule trainSchedule;
	
	@ManyToOne
	@JoinColumn(name="source_station_id")
	private Station sourceStation;
	
	@ManyToOne
	@JoinColumn(name="destination_station_id")
	private Station destinationStation;
	
	private LocalDate journeyDate;
	
	private BigDecimal totalFare;
	
	@Enumerated(EnumType.STRING)
	private BookingStatus bookingStatus;
	
	private LocalDateTime createdAt;

	@OneToMany(mappedBy="booking")
	private List<BookingPassenger> passengers;
	
	@OneToOne(mappedBy="booking" ,cascade= CascadeType.ALL)
	private Payment payment;
	
	
	 
	
	
	
	
	
}
