package com.sametcanal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// DTO = Data Transfer Object
public class StudentDto {

    private Long studentId;
    private String studentName;
    private String studentSurname;
}
