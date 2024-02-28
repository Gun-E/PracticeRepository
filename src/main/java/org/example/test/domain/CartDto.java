package org.example.test.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
    private String name;
    private String brand;
    private int originalPrice;
    private int discountedPrice;
    private List<String> tags;
    private String image;
    private String option;
    private int quantity;
}
