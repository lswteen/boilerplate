package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.SearchConditionEntity;
import com.renzo.zelda.search.entity.SearchEntity;
import com.renzo.zelda.search.model.Search;
import com.renzo.zelda.search.model.SearchCondition;
import java.time.LocalDateTime;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-01T22:46:31+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class SearchMapperImpl implements SearchMapper {

    @Override
    public Search toModel(SearchEntity searchEntity) {
        if ( searchEntity == null ) {
            return null;
        }

        Long id = null;
        String userId = null;
        String title = null;
        Integer order = null;
        LocalDateTime createdAt = null;
        LocalDateTime updatedAt = null;
        List<SearchCondition> searchConditionList = null;

        Search search = new Search( id, userId, title, order, createdAt, updatedAt, searchConditionList );

        return search;
    }

    @Override
    public SearchEntity toEntity(Search search) {
        if ( search == null ) {
            return null;
        }

        SearchEntity searchEntity = new SearchEntity();

        return searchEntity;
    }

    @Override
    public SearchCondition toModel(SearchConditionEntity searchConditionEntity) {
        if ( searchConditionEntity == null ) {
            return null;
        }

        Long id = null;
        Long mappingSearchId = null;
        String type = null;
        String value = null;
        LocalDateTime createdAt = null;
        LocalDateTime updatedAt = null;
        Search search = null;

        SearchCondition searchCondition = new SearchCondition( id, mappingSearchId, type, value, createdAt, updatedAt, search );

        return searchCondition;
    }

    @Override
    public SearchConditionEntity toEntity(SearchCondition searchCondition) {
        if ( searchCondition == null ) {
            return null;
        }

        Long id = null;
        Long mappingSearchId = null;
        String type = null;
        String value = null;
        LocalDateTime createdAt = null;
        LocalDateTime updatedAt = null;

        id = searchCondition.id();
        mappingSearchId = searchCondition.mappingSearchId();
        type = searchCondition.type();
        value = searchCondition.value();
        createdAt = searchCondition.createdAt();
        updatedAt = searchCondition.updatedAt();

        SearchEntity searchEntity = null;

        SearchConditionEntity searchConditionEntity = new SearchConditionEntity( id, mappingSearchId, type, value, createdAt, updatedAt, searchEntity );

        return searchConditionEntity;
    }
}
