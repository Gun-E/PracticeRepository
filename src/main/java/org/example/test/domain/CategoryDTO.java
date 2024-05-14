package org.example.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private int productCategoryId;
    private String name;
    private CategoryDTO parentCategory;

    public CategoryDTO(int id, String name) {
        this.productCategoryId = id;
        this.name = name;
    }
}
