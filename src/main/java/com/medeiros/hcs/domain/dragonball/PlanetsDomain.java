package com.medeiros.hcs.domain.dragonball;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanetsDomain {

    @JsonProperty("items")
    public List<PlanetsItem> items;
    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("links")
    public Link links;
}
