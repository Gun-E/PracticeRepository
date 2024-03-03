package org.example.test.domain;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoticeDetailDto {
    private int id;
    private String title;
    private String content;
    private String name;
    private LocalDate day;
}
