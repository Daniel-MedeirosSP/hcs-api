package com.medeiros.hcs.app.to.dragonball;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.medeiros.hcs.domain.dragonball.Link;
import com.medeiros.hcs.domain.dragonball.Meta;
import com.medeiros.hcs.domain.dragonball.PlanetsItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PlanetsTo {
    @JsonProperty("items")
    public List<PlanetsItem> items;
    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("links")
    public Link links;
}
