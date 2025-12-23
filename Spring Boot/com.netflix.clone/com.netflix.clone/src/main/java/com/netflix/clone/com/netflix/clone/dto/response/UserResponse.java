package com.netflix.clone.com.netflix.clone.dto.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok. Data;

import java.util.List;

@Data
@NoArgsConstructor
@ALlArgsConstructor
public class UserResponse {
    private Long id;
    private String email;
    private String fullName;
    private String role;
    private Boolean active;
    private instant createdAt;
    private instant updatedAt;
}
