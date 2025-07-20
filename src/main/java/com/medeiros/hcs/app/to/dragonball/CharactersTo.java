package com.medeiros.hcs.app.to.dragonball;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
public class CharactersTo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "items",
            "meta",
            "links"
    })

    @JsonProperty("items")
    private List<CharactersItem> items;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("links")
    private Link links;
}
