package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import com.example.demo.models.Terrorista;
import com.example.demo.services.ITerroristaService;

//Creacion de controlador para Terrorista
@RestController
@RequestMapping("/binladen")
public class TerroristaController {
    @Autowired
    private ITerroristaService binladenmonth;
    // GET /terrorista
    @GetMapping("/terrorista")
    public List<Terrorista> listarTerroristas(){
        return  binladenmonth.findAll();
    }
    
    //GET /terrorista/:id
    @GetMapping("/terrorista/{id}")
    public Terrorista verTerrorista(@PathVariable Long id){
        return binladenmonth.findById(id);
    }
    //DELETE /terrorista/:id
    @DeleteMapping("/terrorista/{id}")
    public void borrarRegistro(@PathVariable Long id){
        binladenmonth.delete(id);
    }
    //POST /terrorista
    @PostMapping("/terrorista")
    public Terrorista create(@RequestBody Terrorista terrorista){
        return binladenmonth.save(terrorista);
    }
    //PUT /terrorista/:id
    @PutMapping("/terrorista/{id}")
    public Terrorista update (@PathVariable Long id, 
    @RequestBody Terrorista terrorista) {
        Terrorista actual=binladenmonth.findById(id);
        if (actual!=null){
            actual.setNombre(terrorista.getNombre());
            actual.setCrimenes(terrorista.getCrimenes());
            actual.setReward(terrorista.getReward());
        }
        return binladenmonth.save(actual);
    }
}