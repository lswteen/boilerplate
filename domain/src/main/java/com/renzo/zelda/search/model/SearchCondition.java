package com.renzo.zelda.search.model;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder(toBuilder = true)
public record SearchCondition(Long id, Long mappingSearchId,
                              String type, String value,
                              LocalDateTime createdAt, LocalDateTime updatedAt
                              ) {
}
