package com.medeiros.hcs.app.dto;

import com.medeiros.hcs.domain.dragonball.PlanetDomain;
import com.medeiros.hcs.domain.dragonball.TransformationsDomain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CharacterDto {

    private long id;
    private String name;
    private String ki;
    private String maxKi;
    private String race;
    private String gender;
    private String description;
    private String image;
    private String affiliation;
    private String deletedAt;
    private PlanetDomain originPlanet;
    private List<TransformationsDomain> transformations;
}
