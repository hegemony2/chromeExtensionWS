package com.chromeextensionws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chromeextensionws.entity.AggregationEntity;

@RepositoryRestResource
public interface AggregationEntityRepository extends CrudRepository<AggregationEntity, Integer> {

}
