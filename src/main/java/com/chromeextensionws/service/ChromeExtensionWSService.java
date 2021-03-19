package com.chromeextensionws.service;

import org.springframework.stereotype.Service;

import com.chromeextensionws.dto.AggregationObj;

@Service
public class ChromeExtensionWSService {

	public String handleAggregation(AggregationObj aggregationObj) {
		
		return(aggregationObj.toString());
		
	}
	
}
