package com.example.GameAPI.Servises;

import com.example.GameAPI.Repositries.playerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class playerService {
    @Autowired
    playerRepositry PlayerRepositry;
}
