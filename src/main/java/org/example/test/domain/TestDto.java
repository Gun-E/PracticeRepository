package org.example.test.domain;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestDto {
    private String categoryName;
    private List<Category> categories ;
}
