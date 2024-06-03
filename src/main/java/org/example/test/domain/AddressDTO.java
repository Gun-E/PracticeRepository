package org.example.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AddressDTO {
    private Long id;
    private String addressLine;
}
