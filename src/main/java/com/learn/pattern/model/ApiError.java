package com.learn.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ApiError {
    private int statusCode;
    private String reason;
    private LocalDateTime dateTime;
}
