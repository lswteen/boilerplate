package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.SearchConditionEntity;
import com.renzo.zelda.search.entity.SearchEntity;
import com.renzo.zelda.search.model.Search;
import com.renzo.zelda.search.model.SearchCondition;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface SearchMapper {

    SearchMapper INSTANCE = Mappers.getMapper(SearchMapper.class);


    Search toModel(SearchEntity searchEntity);
    SearchEntity toEntity(Search search); // ID 필드 매핑 필요


    SearchCondition toModel(SearchConditionEntity searchConditionEntity);
    SearchConditionEntity toEntity(SearchCondition searchCondition); // ID 필드 매핑 필요
}
