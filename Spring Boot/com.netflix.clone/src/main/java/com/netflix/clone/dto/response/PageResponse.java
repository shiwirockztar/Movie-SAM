package com.netflix.clone.dto.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok. Data;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse<T> {
    private List<T> content;
    private long totalElements;
    private int totalPages;
    private int number;
    private int size;
}
