package com.mycompany.firstmicroservice.repository;

import com.mycompany.firstmicroservice.model.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends JpaRepository<License, Long> {
    
}
