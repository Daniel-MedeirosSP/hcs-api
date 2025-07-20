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

public class Link {

    @JsonProperty("first")
    private String first;
    @JsonProperty("previous")
    private String previous;
    @JsonProperty("next")
    private String next;
    @JsonProperty("last")
    private String last;

}
