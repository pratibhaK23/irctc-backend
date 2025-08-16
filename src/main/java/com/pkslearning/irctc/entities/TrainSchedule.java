package com.pkslearning.irctc.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="train_schedules")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainSchedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private LocalDateTime runDate;
	
	@ManyToOne
	@JoinColumn(name="train_id")
	private Train train;
	
	private Integer availableSeats;
	
	@OneToMany(mappedBy="trainSchedule")
	private List<TrainSeat> trainSeats;
	
	@OneToMany(mappedBy="trainSchedule")
	private List<Booking> bookings;
	
}
