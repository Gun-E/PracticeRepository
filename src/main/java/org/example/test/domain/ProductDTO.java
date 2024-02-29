package org.example.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductDTO {
    private String brand;
    private String name;
    private String option;
    private int amount;
}
