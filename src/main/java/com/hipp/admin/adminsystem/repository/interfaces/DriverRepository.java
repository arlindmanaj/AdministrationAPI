package com.hipp.admin.adminsystem.repository.interfaces;

import com.hipp.admin.adminsystem.model.domain.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface IDriverRepository extends JpaRepository<Driver, Integer> {
    Optional<Driver> findByLicensePlate(String licensePlate);
}
