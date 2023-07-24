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
    public void UpdatedPlayer(@PathVariable Long Id, @RequestBody playerModel updatedPlayer) {
        PlayerService.updatePlayer(Id, updatedPlayer);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Long id) {

        PlayerService.deletePlayer(id);
            return ResponseEntity.noContent().build();

    }
}
