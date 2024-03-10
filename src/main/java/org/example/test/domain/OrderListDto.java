package org.example.test.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderListDto {
    private int orderId;
    private String status;
    private int totalPrice;
    private LocalDateTime day;
    private String companyName;
}
