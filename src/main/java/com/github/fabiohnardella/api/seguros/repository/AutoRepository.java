package com.github.fabiohnardella.api.seguros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.fabiohnardella.api.seguros.models.Auto;

public interface AutoRepository extends JpaRepository<Auto, Long>{
    
}