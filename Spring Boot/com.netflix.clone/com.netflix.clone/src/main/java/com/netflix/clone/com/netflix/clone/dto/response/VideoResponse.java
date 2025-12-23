package com.netflix.clone.com.netflix.clone.dto.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok. Data;

import java.util.List;

@Data
@NoArgsConstructor
public class VideoResponse {
    private Long id;
    private String title;
    private String description;
    private Integer year;
    private String rating;
    private Integer duration;
    private String src;
    private String poster;
    private Boolean published;
    private List<String> categories;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isInWatchlist;
}
