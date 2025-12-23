package com.netflix.clone.com.netflix.clone.dto.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoStatsResponse {
    private Long totalVideos;
    private Long publishedVideos;
    private Long totalDuration;
}
