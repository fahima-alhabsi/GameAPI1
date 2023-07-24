package com.example.GameAPI.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
@Data

public class playerModel implements Serializable {
    @Id
 @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public  Long id;
    public String name;
    public int age ;
    public String nationality ;


}
