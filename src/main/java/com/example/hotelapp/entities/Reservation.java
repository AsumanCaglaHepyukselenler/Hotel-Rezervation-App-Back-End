package com.example.hotelapp.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Reservation")
@Data
public class Reservation {
	
	@Id
	Long id;
	
	String UserName;
	String Email;

	BigDecimal Price;
	String RoomType;
	Date Date;
	BigDecimal AdultCount;
	BigDecimal ChildCount;
	
	

}