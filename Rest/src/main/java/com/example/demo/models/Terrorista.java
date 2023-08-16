package com.example.demo.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="terroristas")
public class Terrorista implements Comparable<Terrorista>,Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private Integer crimenes;
    @Column
    private Double reward;
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
    public void setReward (double ca ){
        this.reward=ca;
    }
    public Double getReward () {
        return reward;
    }
    @Override
    public int compareTo(Terrorista e) {
        // TODO Auto-generated method stub
        if(this.getCrimenes()>e.getCrimenes()){
            return -1;
        }
        else if(this.getReward().equals(e.getReward())){
            return (int) (e.getReward()-this.getReward());
        }
        else{
            return 1;
        }
    }

}