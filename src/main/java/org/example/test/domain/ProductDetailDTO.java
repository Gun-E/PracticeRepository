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
public class ProductDetailDTO {
    private int id;
    private String name;
    private String image;
    private int originalPrice;
    private int salePrice;
    private int barCodeNumber;
    private String brandOrigin;
    private String weight;
    private String packaging;
    private List<String> tags;
    private String category;
    private int quantity;
}
