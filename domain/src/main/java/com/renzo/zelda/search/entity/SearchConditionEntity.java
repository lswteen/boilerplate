package com.renzo.zelda.search.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Table(name="searchCondition")
@Entity(name="searchCondition")
@Builder()
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class SearchConditionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="mapping_search_id")
    private Long mappingSearchId;
    private String type;
    @Column(name="type_value")
    private String value;
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name="mapping_search_id", insertable = false, updatable = false)
    private SearchEntity searchEntity;

    public SearchConditionEntity(Long id, Long mappingSearchId, String type, String value, LocalDateTime createdAt, LocalDateTime updatedAt, SearchEntity searchEntity) {
        this.id = id;
        this.mappingSearchId = mappingSearchId;
        this.type = type;
        this.value = value;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.searchEntity = searchEntity;
    }
}
