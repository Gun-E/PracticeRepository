package org.example.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductListDTO {
    private Long productId;
    private String thumbnailFileName;
    private String brandName;
    private String name;
    private String weight;
    private int listPrice;
    private int sellingPrice;
}
