package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Anime;

public interface IAnimeDAO extends JpaRepository<Anime, Long> {
    
}
