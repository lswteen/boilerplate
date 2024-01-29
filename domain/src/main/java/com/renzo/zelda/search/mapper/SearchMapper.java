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

    Search searchEntityToSearch(SearchEntity entity);

    SearchEntity searchToSearchEntity(Search search);

    SearchCondition searchCoditionEntityToSearchCondition(SearchConditionEntity entity);

    SearchConditionEntity searchConditionToSearchConditionEntity(SearchCondition searchCondition);

}
