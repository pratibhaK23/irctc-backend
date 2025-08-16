package com.pkslearning.irctc.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Column(unique=true)
	private String email;
	
	private String password;
	
	private long phone;
	
	private LocalDateTime createdAt;
	
	private UserRole userRole=UserRole.ROLE_NORMAL;
	
	@OneToMany(mappedBy="user")
	private List<Booking> bookings;
	
	
	
}
