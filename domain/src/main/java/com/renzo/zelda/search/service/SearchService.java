package com.renzo.zelda.search.service;

import com.renzo.zelda.search.entity.SearchConditionEntity;
import com.renzo.zelda.search.entity.SearchEntity;
import com.renzo.zelda.search.mapper.SearchMapper;
import com.renzo.zelda.search.model.Search;
import com.renzo.zelda.search.model.SearchCondition;
import com.renzo.zelda.search.repository.SearchConditionRepository;
import com.renzo.zelda.search.repository.SearchRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final SearchRepository searchRepository;
    private final SearchConditionRepository searchConditionRepository;
    private final SearchMapper searchMapper = SearchMapper.INSTANCE;

    Search getSearchWithConditions(Long mappingSearchId){
        SearchEntity searchEntity = searchRepository.findById(mappingSearchId)
                .orElseThrow(()-> new EntityNotFoundException("mapping search not found"));
        return searchMapper.toModel(searchEntity);
    }

    SearchCondition createSearchCondition(Long mappingSearchId,
                                          String type, String value){
        SearchEntity searchEntity = searchRepository.findById(mappingSearchId)
                .orElseThrow(()-> new EntityNotFoundException("mapping search not found"));

        SearchConditionEntity searchConditionEntity = searchConditionRepository.save(SearchConditionEntity.builder()
                .mappingSearchId(mappingSearchId)
                .type(type)
                .value(value)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .searchEntity(searchEntity)
                .build());
        return searchMapper.toModel(searchConditionEntity);
    }

}
