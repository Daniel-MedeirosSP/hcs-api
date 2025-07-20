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
public class Meta {

    @JsonProperty("totalItems")
    private long totalItems;
    @JsonProperty("itemCount")
    private long itemCount;
    @JsonProperty("itemsPerPage")
    private long itemsPerPage;
    @JsonProperty("totalPages")
    private long totalPages;
    @JsonProperty("currentPage")
    private long currentPage;
}
