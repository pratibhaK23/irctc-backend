package com.pkslearning.irctc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationDto {

	 private long id;
	  
	  private String code;
	  
	  private String name;
	  
	  private String city;
	  
	  private String state;
}
