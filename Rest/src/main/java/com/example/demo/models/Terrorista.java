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
    @Override
    public int compareTo(Terrorista e) {
        // TODO Auto-generated method stub
        if(this.getReward()>e.getReward()){
            return -1;
        }
        else if(this.getCrimenes()> e.getCrimenes()){
            return (e.getCrimenes()-this.getCrimenes());
        }
        else{
            return 1;
        }
    }

}