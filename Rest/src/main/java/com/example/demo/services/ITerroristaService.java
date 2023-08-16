package com.example.demo.services;


import java.util.List;
import com.example.demo.models.Terrorista;

public interface ITerroristaService {
    public List<Terrorista> findAll();
    public Terrorista findById(Long id);
    public void delete(Long id);
    public Terrorista save (Terrorista terrorista);

}