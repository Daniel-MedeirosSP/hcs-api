package com.medeiros.hcs.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.medeiros.hcs.domain.dragonball.CharactersItem;
import com.medeiros.hcs.domain.dragonball.Link;
import com.medeiros.hcs.domain.dragonball.Meta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CharactersDto {

    @JsonProperty("items")
    private List<CharactersItem> items;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("links")
    private Link links;
}
