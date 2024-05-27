package com.example.hotelapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "User")
@Data
public class User {

    @Id
    Long id;

    String userName;
    String password;
    String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public Object getId() {
		return id;
	}

	public void setId(Object id2) {
		this.id = (Long) id;
		
	}

	public Object getEmail() {
		return email;
	}

	public void setEmail(Object email2) {
		
	}


}