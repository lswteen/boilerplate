package com.renzo.zelda.search.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Table(name="searchCondition")
@Entity(name="searchCondition")
@Builder()
@NoArgsConstructor(access = AccessLevel.PUBLIC)

public class SearchConditionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long mappingSearchId;
    private String type;
    private String value;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name="mappingSearchId", insertable = false, updatable = false)
    private SearchEntity searchEntity;

    public SearchConditionEntity(Long id, Long mappingSearchId,
                                 String type, String value,
                                 LocalDateTime createdAt, LocalDateTime updatedAt,
                                 SearchEntity searchEntity) {
        this.id = id;
        this.mappingSearchId = mappingSearchId;
        this.type = type;
        this.value = value;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.searchEntity = searchEntity;
    }
}
