package com.pkslearning.irctc.entities;

import java.time.LocalTime;

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
@Table(name="train_routes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainRoute {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="train_id")
	private Train train;
	
	@ManyToOne
	@JoinColumn(name="station_id")
	private Station station;
	
	private Integer stationOrder;
	
	private LocalTime arrivalTime;
	
	private LocalTime departureTime;
	
	private Integer haltMinutes;
	
	private Integer distanceFromSource;
	
	
}
