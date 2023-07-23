package com.example.GameAPI.Repositries;

import com.example.GameAPI.Models.playerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface playerRepositry extends JpaRepository<playerModel, Long> {

}
