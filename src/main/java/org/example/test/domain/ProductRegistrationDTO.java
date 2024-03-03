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
public class ProductRegistrationDTO {
    private List<TagDTO> tags;
    private List<CategoryDTO> categorys;

}
