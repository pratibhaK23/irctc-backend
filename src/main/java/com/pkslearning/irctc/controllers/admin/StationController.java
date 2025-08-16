package com.pkslearning.irctc.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkslearning.irctc.dto.StationDto;
import com.pkslearning.irctc.services.admin.StationService;

@RestController
@RequestMapping("/admin/stations")
public class StationController {
	
	private StationService stationService;
	
	
	public StationController(StationService stationService)
	{
		this.stationService=stationService;
	}
	
	@PostMapping
	public ResponseEntity<StationDto> createStation(@RequestBody StationDto stationDto)
	{
		StationDto dto=stationService.createStations(stationDto);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

}
