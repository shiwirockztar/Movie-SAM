package com.netflix.clone.dto.response;

import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.List;
import java.time.Instant;
import com.netflix.clone.entity.Video;

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

    public VideoResponse(long id, String title, String description, Integer year, String rating, Integer duration, String src, String poster, Boolean published, List<String> categories, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
        this.src = src;
        this.poster = poster;
        this.published = published;
        this.categories = categories;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        //this.isInWatchlist = isInWatchlist;
    }

    public static VideoResponse fromEntity(Video video) {
        VideoResponse response = new VideoResponse(
            video.getId(),
            video.getTitle(),
            video.getDescription(),
            video.getYear(),            
            video.getRating(),
            video.getDuration(),
            video.getSrc(),
            video.getPoster(),
            video.isPublished(),
            video.getCategories(),
            //video.getCategories().stream().map(Category::getName).collect(Collectors.toList()),
            video.getCreatedAt(),
            video.getUpdatedAt()
        );

        if (video.getIsInWatchlist() != null) {
            response.setIsInWatchlist(video.getIsInWatchlist());
        } 
        return response;
            
    }
}

