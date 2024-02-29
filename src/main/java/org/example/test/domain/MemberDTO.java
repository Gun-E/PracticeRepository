package org.example.test.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MemberDTO {
    private String name;
    private String phone;
    private String email;
    private String company;
    private String zipcode;
    private String address;
    private String detailAddress;
}
