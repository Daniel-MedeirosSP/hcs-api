package com.medeiros.hcs.domain.dragonball;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanetsItem {

    @JsonProperty("id")
    public long id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("isDestroyed")
    public boolean isDestroyed;
    @JsonProperty("description")
    public String description;
    @JsonProperty("image")
    public String image;
    @JsonProperty("deletedAt")
    public Boolean deletedAt;

}
