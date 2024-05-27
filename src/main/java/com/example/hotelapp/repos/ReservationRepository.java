package com.example.hotelapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hotelapp.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Additional query methods, if needed
}

