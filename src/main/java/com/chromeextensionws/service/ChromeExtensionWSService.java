package com.chromeextensionws.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chromeextensionws.dto.AggregationObj;
import com.chromeextensionws.entity.AggregationEntity;
import com.chromeextensionws.repository.AggregationEntityRepository;

@Service
public class ChromeExtensionWSService {

    private ModelMapper modelMapper = new ModelMapper();
	
    @Autowired
    AggregationEntityRepository aggregationEntityRepository;
    
	public String handleAggregation(AggregationObj aggregationObj) {
		
		AggregationEntity aggregationEntity = modelMapper.map(aggregationObj, AggregationEntity.class);
		
		aggregationEntityRepository.save(aggregationEntity);
		
		return(aggregationObj.toString());
		
	}
	
}
