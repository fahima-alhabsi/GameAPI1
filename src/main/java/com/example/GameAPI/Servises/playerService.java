package com.example.GameAPI.Servises;

import com.example.GameAPI.Models.playerModel;
import com.example.GameAPI.Repositries.playerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class playerService {
    @Autowired
    playerRepositry PlayerRepositry;

    public playerModel createPlayer(@RequestBody playerModel player) {
        return PlayerRepositry.save(player);
    }

    public List<playerModel> getAllPlayers() {
        return PlayerRepositry.findAll();
    }


    public playerModel updatePlayer(Long id, playerModel updatedPlayers) {

            playerModel player = new playerModel();
            player.id=updatedPlayers.id;
            player.name=updatedPlayers.name;
            player.age=updatedPlayers.age;
            player.nationality=updatedPlayers.nationality;
            PlayerRepositry.save(player);
        return PlayerRepositry.findById(id).get();

    }

}
