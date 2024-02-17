package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.SearchConditionEntity;
import com.renzo.zelda.search.entity.SearchEntity;
import com.renzo.zelda.search.model.Search;
import com.renzo.zelda.search.model.SearchCondition;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T13:31:45+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.7 (Amazon.com Inc.)"
)
public class SearchMapperImpl implements SearchMapper {

    @Override
    public Search toModel(SearchEntity searchEntity) {
        if ( searchEntity == null ) {
            return null;
        }

        Search.SearchBuilder search = Search.builder();

        search.id( searchEntity.getId() );
        search.userId( searchEntity.getUserId() );
        search.title( searchEntity.getTitle() );
        search.order( searchEntity.getOrder() );
        search.createdAt( searchEntity.getCreatedAt() );
        search.updatedAt( searchEntity.getUpdatedAt() );
        search.searchConditionList( searchConditionEntityListToSearchConditionList( searchEntity.getSearchConditionList() ) );

        return search.build();
    }

    @Override
    public SearchEntity toEntity(Search search) {
        if ( search == null ) {
            return null;
        }

        SearchEntity.SearchEntityBuilder searchEntity = SearchEntity.builder();

        searchEntity.id( search.id() );
        searchEntity.userId( search.userId() );
        searchEntity.title( search.title() );
        searchEntity.order( search.order() );
        searchEntity.createdAt( search.createdAt() );
        searchEntity.updatedAt( search.updatedAt() );
        searchEntity.searchConditionList( searchConditionListToSearchConditionEntityList( search.searchConditionList() ) );

        return searchEntity.build();
    }

    @Override
    public SearchCondition toModel(SearchConditionEntity searchConditionEntity) {
        if ( searchConditionEntity == null ) {
            return null;
        }

        SearchCondition.SearchConditionBuilder searchCondition = SearchCondition.builder();

        searchCondition.id( searchConditionEntity.getId() );
        searchCondition.mappingSearchId( searchConditionEntity.getMappingSearchId() );
        searchCondition.type( searchConditionEntity.getType() );
        searchCondition.value( searchConditionEntity.getValue() );
        searchCondition.createdAt( searchConditionEntity.getCreatedAt() );
        searchCondition.updatedAt( searchConditionEntity.getUpdatedAt() );

        return searchCondition.build();
    }

    @Override
    public SearchConditionEntity toEntity(SearchCondition searchCondition) {
        if ( searchCondition == null ) {
            return null;
        }

        SearchConditionEntity.SearchConditionEntityBuilder searchConditionEntity = SearchConditionEntity.builder();

        searchConditionEntity.id( searchCondition.id() );
        searchConditionEntity.mappingSearchId( searchCondition.mappingSearchId() );
        searchConditionEntity.type( searchCondition.type() );
        searchConditionEntity.value( searchCondition.value() );
        searchConditionEntity.createdAt( searchCondition.createdAt() );
        searchConditionEntity.updatedAt( searchCondition.updatedAt() );

        return searchConditionEntity.build();
    }

    protected List<SearchCondition> searchConditionEntityListToSearchConditionList(List<SearchConditionEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SearchCondition> list1 = new ArrayList<SearchCondition>( list.size() );
        for ( SearchConditionEntity searchConditionEntity : list ) {
            list1.add( toModel( searchConditionEntity ) );
        }

        return list1;
    }

    protected List<SearchConditionEntity> searchConditionListToSearchConditionEntityList(List<SearchCondition> list) {
        if ( list == null ) {
            return null;
        }

        List<SearchConditionEntity> list1 = new ArrayList<SearchConditionEntity>( list.size() );
        for ( SearchCondition searchCondition : list ) {
            list1.add( toEntity( searchCondition ) );
        }

        return list1;
    }
}
