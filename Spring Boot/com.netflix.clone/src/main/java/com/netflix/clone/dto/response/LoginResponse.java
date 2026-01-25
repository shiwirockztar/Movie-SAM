package com.netflix.clone.dto.response;

import lombok.AllArgsConstructor;
import lombok. Data;

@Data
@ALlArgsConstructor
public class LoginResponse {
    private String token;
    private String email;
    private String fullName;
    private String role;
}




