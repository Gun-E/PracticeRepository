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
    private Long productId;
    private String productName;
    private String brandName;
    private Long listPrice;
    private Long sellingPrice;
    private String thumbnailFileName;
    private String weight;
    private Long productQuantity;
    private Long shoppingCartId;
}
