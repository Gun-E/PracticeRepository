package org.example.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private int id;
    private String name;
    private String phone;
    private String companyName;
    private String zipcode;
    private String address;
    private String detailAddress;
    private String email;
    private String userpasswd;
}
