package com.medeiros.hcs.app.controller.dragonball;

import com.medeiros.hcs.app.dto.CharacterDto;
import com.medeiros.hcs.app.dto.CharactersDto;
import com.medeiros.hcs.app.dto.PlanetsDto;
import com.medeiros.hcs.app.service.DragonballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

@RestController
@RequestMapping("/dragonball")
public class DragonballController {


    private final DragonballService dragonballService;

    @Autowired
    public DragonballController(DragonballService dragonballService) {
        this.dragonballService = dragonballService;
    }

    @GetMapping("/characters")
    public ResponseEntity<CharactersDto> getCharacters() {
            return ResponseEntity.ok(dragonballService.findCharacters());
        }


    @GetMapping("/characters/{id}")
    public ResponseEntity<CharacterDto> getCharacter(@PathVariable String id) {
        return ResponseEntity.ok(dragonballService.findCharacter(id));
    }
    @GetMapping("/planets")
    public ResponseEntity<PlanetsDto> getPlanets() {
        return ResponseEntity.ok(dragonballService.findPlanets());
    }
}
