package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.SearchConditionEntity;
import com.renzo.zelda.search.entity.SearchEntity;
import com.renzo.zelda.search.model.Search;
import com.renzo.zelda.search.model.SearchCondition;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-29T22:29:12+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.7 (Amazon.com Inc.)"
)
public class SearchMapperImpl implements SearchMapper {

    @Override
    public SearchEntity searchToSearchEntity(Search search) {
        if ( search == null ) {
            return null;
        }

        SearchEntity searchEntity = new SearchEntity();

        return searchEntity;
    }

    @Override
    public SearchConditionEntity searchConditionToSearchConditionEntity(SearchCondition searchCondition) {
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
