package com.example.demo.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="terroristas")
public class Terrorista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private Integer crimenes;
    @Column
    private Integer reward;
    public void setNombre (String n){
        this.nombre=n;
    }
    public Long getId(){
        return id;
    }
    public  String getNombre(){
        return nombre;
    }
    public void setCrimenes (int c ){
        this.crimenes =c ;
    }
    public   int getCrimenes (){
        return crimenes;
    }
    public void setReward (int ca ){
        this.reward=ca;
    }
    public int getReward () {
        return reward;
    }
}