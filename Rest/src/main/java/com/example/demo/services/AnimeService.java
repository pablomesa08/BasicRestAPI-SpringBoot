package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAnimeDAO;
import com.example.demo.models.Anime;

@Service
public class AnimeService implements IAnimeService{
    
    @Autowired
    private IAnimeDAO animeDAO;
    @Override
    public List<Anime> findAll() {
        
        return animeDAO.findAll();
    }
    @Override
    public Anime findById(Long id) {
        // TODO Auto-generated method stub
        return animeDAO.findById(id).orElse(null);
    }
    @Override
    public void delete(Long id) {
        
        animeDAO.deleteById(id);
    }
    @Override
    public Anime save(Anime anime) {
        return animeDAO.save(anime);
    }
    
}
