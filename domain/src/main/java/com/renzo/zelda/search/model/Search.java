package com.renzo.zelda.search.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder(toBuilder = true)
public record Search (Long id, String userId,
                      String title, Integer order,
                      LocalDateTime createdAt, LocalDateTime updatedAt,
                      List<SearchCondition> searchConditionList

){

}
