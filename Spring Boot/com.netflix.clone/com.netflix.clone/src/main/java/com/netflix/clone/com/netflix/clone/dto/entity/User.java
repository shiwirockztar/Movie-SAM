package com.netflix.clone.com.netflix.clone.dto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence. Table;
import Lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name="users")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, unique = true)
    private String email;

    @Column (nullable = false)
    private String password;

    @Column (nullable = false)
    private String fullName;

    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private Role role = Role.USER;

    @Column (nullable = false)
    private boolean active = true;

    @Column (nullable = false)
    private boolean emailVerified = false;

    @Column (unique = true)
    private String verificationToken;

    @Column
    private Instant verificationTokenExpiry;

    @Column
    private String passwordRestToken;

    @Column
    private Instant passwordRestTokenExpiry;

    @CreationTimestamp
    @Column (nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column (nullable = false)
    private Instant updatedAt;

    @JsonIgnore
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable(
        name = "user_watchlist",
        joinColumns = @JoinColumn (name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "video_id")
    )
    private Set<Video> watchlist = new HashSet<>();

    public void addToWatchlist(Video video) {
        this.watchlist.add(video);
    }

    public void removeFromWatchlist(Video video) {
        this.watchlist.remove(video);
    }
}
