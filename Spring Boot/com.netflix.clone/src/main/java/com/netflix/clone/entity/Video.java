package com.netflix.clone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence. Table;
import Lombok. Getter;
import Lombok. Setter;
@Entity 
@Table (name = "videos")
@Getter
@Setter
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String title;

    @Column (Length = 4000)
    private String description;

    private Integer year;
    private String rating;
    private Integer duration;

    @Column (name = "src")
    @JsonIgnore
    private String srcUuid;

    @Column (name = "poster")
    @JsonIgnore
    private String posterUuid;

    @Column (nullable = false)
    private boolean published = false;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "video_categories", joinColumns = @JoinColumn(name = "video_id"))
    @Column (name = "category")
    private List<String> categories = new ArrayList<>();

    @CreationTimestamp
    @Column (nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column (nullable = false)
    private Instant updatedAt;

    @Transient
    @JsonProperty("isInWatchlist")
    private Boolean isInWatchlist;

    @JsonProperty ("src") 
    public String getSrc() {
        if(srcUuid != null && !srcUuid.isEmpty()) {
            String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath.toUriString();
            return baseUrl+ "/api/files/video/"+srcUuid;
        }
        return null;
    }

    @JsonProperty ("poster")
    public String getPoster() {
        if(posterUuid != null && !posterUuid.isEmpty()) {
            String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().toUriString();
            return baseUrl+ "/api/files/image/"+posterUuid;
        }
        return null;
    }
}