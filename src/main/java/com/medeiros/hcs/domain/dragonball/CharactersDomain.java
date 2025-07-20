package com.medeiros.hcs.domain.dragonball;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CharactersDomain {

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
