package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.SearchEntity;
import com.renzo.zelda.search.model.Search;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class SearchMapperTest {
    @Test
    void testSearchEntityToSearchMapping() {
        // 준비
        SearchEntity searchEntity = SearchEntity.builder()
                .id(1L)
                .userId("renzo")
                .title("검색1")
                .order(0)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        // searchEntity.setSearchConditionList(); // 필요한 경우 설정

        // 실행
        Search search = SearchMapper.INSTANCE.toModel(searchEntity);

        // 검증
        assertNotNull(search);
        assertEquals(searchEntity.getId(), search.id());
        assertEquals(searchEntity.getUserId(), search.userId());
        assertEquals(searchEntity.getTitle(), search.title());
        assertEquals(searchEntity.getOrder(), search.order());
        // 나머지 필드에 대한 검증 추가
    }

    @Test
    void testSearchToSearchEntityMapping() {
        // 준비
        Search search = new Search(1L, "user123", "Test Title", 1, LocalDateTime.now(), LocalDateTime.now(), null);

        // 실행
        SearchEntity searchEntity = SearchMapper.INSTANCE.toEntity(search);

        // 검증
        assertNotNull(searchEntity);
        assertEquals(search.id(), searchEntity.getId());
        assertEquals(search.userId(), searchEntity.getUserId());
        assertEquals(search.title(), searchEntity.getTitle());
        assertEquals(search.order(), searchEntity.getOrder());
        // 나머지 필드에 대한 검증 추가
    }
}