package com.renzo.zelda.search.repository;

import com.renzo.zelda.search.entity.SearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<SearchEntity, Long> {
}
