package com.renzo.zelda.search.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Getter
@Table(name="search")
@Entity(name="search")
@Builder()
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class SearchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String title;
    private Integer order;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder.Default
    @OneToMany(mappedBy = "searchEntity")
    private List<SearchConditionEntity> searchConditionList = Collections.emptyList();
}
