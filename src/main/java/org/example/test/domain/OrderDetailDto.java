package org.example.test.domain;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class OrderDetailDto {
    private Long orderListId;
    private Long orderNumber;
    private String orderApprovalStatus;
    private LocalDate orderDate;
    private List<ProductDTO> products;
    private int subTotal;
    private int totalPrice;
    private String address;
    private String comment;
    private String companyName;
    private String userName;
}
