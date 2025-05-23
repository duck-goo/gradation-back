package com.app.gradationback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class UniversityExhibitionVO {
    private Long id;
    private Date universityExhibitionStartDate;
    private Date universityExhibitionEndDate;
    private String universityExhibitionState;
    private String universityExhibitionTitle;
    private String universityExhibitionLocation;
    private String universityExhibitionStatus;
    private Long majorId;
}
