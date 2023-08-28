package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITerroristaDAO;
import com.example.demo.models.Terrorista;

//Creacion de servicios que se van a llevar al controlador
@Service
public class TerroristaService implements ITerroristaService{
    
    @Autowired
    private ITerroristaDAO terroristaDAO;
    //GET
    @Override
    public List<Terrorista> findAll() {
        
        return terroristaDAO.findAll();
    }
    @Override
    public Terrorista findById(Long id) {
        // TODO Auto-generated method stub
        return terroristaDAO.findById(id).orElse(null);
    }
    //DELETE
    @Override
    public void delete(Long id) {
        
        terroristaDAO.deleteById(id);
    }
    //POST / PUT
    @Override
    public Terrorista save(Terrorista terrorista) {
        return terroristaDAO.save(terrorista);
    }
    
}

