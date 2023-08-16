package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITerroristaDAO;
import com.example.demo.models.Terrorista;

@Service
public class TerroristaService implements ITerroristaService{
    
    @Autowired
    private ITerroristaDAO terroristaDAO;
    @Override
    public List<Terrorista> findAll() {
        
        return terroristaDAO.findAll();
    }
    @Override
    public Terrorista findById(Long id) {
        // TODO Auto-generated method stub
        return terroristaDAO.findById(id).orElse(null);
    }
    @Override
    public void delete(Long id) {
        
        terroristaDAO.deleteById(id);
    }
    @Override
    public Terrorista save(Terrorista anime) {
        return terroristaDAO.save(anime);
    }
    
}

