package com.example.GameAPI.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data

public class playerModel {
    @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    public String name;
    public int age ;
    public String nationality ;
}
