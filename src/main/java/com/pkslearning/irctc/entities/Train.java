package com.pkslearning.irctc.entities;

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
@Table(name="trains")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String number;
	
	private String name;
	
	private Integer totalDistance;
	
	@ManyToOne
	@JoinColumn(name="source_station_id")
	private Station sourceStation;
	
	@ManyToOne
	@JoinColumn(name="destination_station_id")
	private Station destinationStation;
	
	@OneToMany(mappedBy="train")
	private List<TrainRoute> trainRoutes;
	
	@OneToMany(mappedBy="train")
	private List<TrainSchedule> trainSchedules;
	
	
}
