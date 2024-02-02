package com.renzo.zelda.search.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Table(name="search")
@Entity(name="search")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SearchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_id")
    private String userId;

    private String title;

    @Column(name="order_number")
    private Integer order;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "searchEntity",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SearchConditionEntity> searchConditionList;

}
