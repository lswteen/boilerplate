package com.renzo.zelda.search.model;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder()
public record Search (Long id, String userId,
                      String title, Integer order,
                      LocalDateTime createdAt, LocalDateTime updatedAt){

}
