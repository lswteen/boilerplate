package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.SearchConditionEntity;
import com.renzo.zelda.search.entity.SearchEntity;
import com.renzo.zelda.search.model.Search;
import com.renzo.zelda.search.model.SearchCondition;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SearchMapper {

    SearchMapper INSTANCE = Mappers.getMapper(SearchMapper.class);

    // SearchEntity -> Search 매핑
    default Search searchEntityToSearch(SearchEntity entity){
        if(entity == null){
            return null;
        }else{
            return Search.builder()
                    .id(entity.getId()) // ID 필드 추가
                    .userId(entity.getUserId())
                    .title(entity.getTitle())
                    .order(entity.getOrder())
                    .createdAt(entity.getCreatedAt())
                    .updatedAt(entity.getUpdatedAt())
                    .build();
        }
    }

    SearchEntity searchToSearchEntity(Search search); // ID 필드 매핑 필요

    // SearchConditionEntity -> SearchCondition 매핑
    default SearchCondition searchConditionEntityToSearchCondition(SearchConditionEntity entity){
        if(entity == null){
            return null;
        }else{
            return SearchCondition.builder()
                    .id(entity.getId()) // ID 필드 추가
                    .mappingSearchId(entity.getMappingSearchId())
                    .type(entity.getType())
                    .value(entity.getValue())
                    .createdAt(entity.getCreatedAt())
                    .updatedAt(entity.getUpdatedAt())
                    .build();
        }
    }

    SearchConditionEntity searchConditionToSearchConditionEntity(SearchCondition searchCondition); // ID 필드 매핑 필요
}
