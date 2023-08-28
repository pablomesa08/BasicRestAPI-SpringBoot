package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Terrorista;

//Se define la interfaz que va a implementar el DAO
public interface ITerroristaDAO extends JpaRepository<Terrorista, Long> {
    
}