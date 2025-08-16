package com.pkslearning.irctc.services.admin;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkslearning.irctc.dto.StationDto;
import com.pkslearning.irctc.entities.Station;
import com.pkslearning.irctc.repositories.admin.StationRepo;

@Service
public class StationServiceImpl implements StationService{

	private StationRepo stationRepo;
	
	private ModelMapper modelMapper;
	
	public StationServiceImpl(StationRepo stationRepo , ModelMapper modelMapper)
	{
		this.stationRepo=stationRepo;
		this.modelMapper=modelMapper;
	}
	@Override
	public StationDto createStations(StationDto stationDto) {
		// TODO Auto-generated method stub
		Station station=modelMapper.map(stationDto, Station.class);
		Station savedStation= stationRepo.save(station);
		
		return modelMapper.map(savedStation, StationDto.class);
	}
	

}
