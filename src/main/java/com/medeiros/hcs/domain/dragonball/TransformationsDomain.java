package com.medeiros.hcs.domain.dragonball;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransformationsDomain {

    private long id;
    private String name;
    private String image;
    private String ki;
    private String deletedAt;

}
