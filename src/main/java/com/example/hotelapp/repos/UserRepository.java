package com.example.hotelapp.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Object findById = null;
    // Additional query methods, if needed
}