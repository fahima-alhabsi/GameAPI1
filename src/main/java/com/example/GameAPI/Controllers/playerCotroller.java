package com.example.GameAPI.Controllers;

import com.example.GameAPI.Models.playerModel;
import com.example.GameAPI.Servises.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/player")
public class playerCotroller {
    @Autowired
    playerService PlayerService;
    @PostMapping
    public playerModel createPlayer(@RequestBody playerModel incomingPlayer) {
        return PlayerService.createPlayer(incomingPlayer);
    }
    @GetMapping
    public List<playerModel> getAllPlayers() {
        return PlayerService.getAllPlayers();
    }

    @PutMapping("/{Id}")
    public ResponseEntity<Optional<playerModel>> updateProduct(@PathVariable Long Id, @RequestBody playerModel updatedProduct) {
        Optional<playerModel> response = PlayerService.updatePlayer(Id, updatedProduct);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
