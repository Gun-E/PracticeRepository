package org.example.test.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoticeDto {
    private Long noticeId;
    private LocalDateTime modifiedDate;
    private String title;
    private String userName;
}
