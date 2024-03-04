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
    private int id;
    private String name;
    private String icon;
    private CategoryDTO parentCategory;

    public CategoryDTO(int id, String name, String icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }
}
