package com.example.GameAPI.Controllers;

import com.example.GameAPI.Servises.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class playerCotroller {
    @Autowired
    playerService PlayerService;


}
