package org.example.test.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {
    private List<ProductDTO> products;
    private List<AddressDTO> addressList;
    private double totalPrice;
}
