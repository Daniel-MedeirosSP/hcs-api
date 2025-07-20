package com.medeiros.hcs.domain.dragonball;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanetDomain {

    private long id;
    private String name;
    private boolean isDestroyed;
    private String description;
    private String image;
    private String deletedAt;

}
