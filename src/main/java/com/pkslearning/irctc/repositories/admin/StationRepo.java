package com.pkslearning.irctc.repositories.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkslearning.irctc.entities.Station;

@Repository
public interface StationRepo extends JpaRepository<Station, Long>{

}
