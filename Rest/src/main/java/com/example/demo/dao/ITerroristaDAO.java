package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Terrorista;

public interface ITerroristaDAO extends JpaRepository<Terrorista, Long> {
    
}