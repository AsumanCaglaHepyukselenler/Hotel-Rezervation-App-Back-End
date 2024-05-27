package com.example.hotelapp.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Contact")
@Data
public class Contact {
	
	@Id
	Long id;
	
	String Name;
	String Surname;
	String Password;
	String Email;
	@Lob
	@Column(columnDefinition="Text")
	String Text;
	
}