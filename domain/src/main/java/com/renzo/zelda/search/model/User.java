package com.renzo.zelda.search.model;

import lombok.Builder;

@Builder()
public record User(Long userId, String keyword, String gender) {
}
