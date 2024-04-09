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
public class DiscountDTO {
    private Long discountId;

    private String discountName;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
