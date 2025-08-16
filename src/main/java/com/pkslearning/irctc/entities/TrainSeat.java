package com.pkslearning.irctc.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name="train_seats")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainSeat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="train_schedule_id")
	private TrainSchedule trainSchedule;
	
	@Enumerated(EnumType.STRING)
	private CoachType coachType ;
	
	private Integer totalSeats;
	
	private Integer availableSeats;
	
	private Integer nextToAssign=1;
	
	private BigDecimal price;
	
}
