package com.chromeextensionws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chromeextensionws.dto.AggregationObj;
import com.chromeextensionws.repository.SnakeRepository;
import com.chromeextensionws.service.ChromeExtensionWSService;

@RestController
public class ChromeExtensionWsRestController {

    Logger log = LoggerFactory.getLogger(ChromeExtensionWsRestController.class);
	
	@Autowired
	private ChromeExtensionWSService chromeExtensionWSService;
	
	@Autowired
	private SnakeRepository snakeRepository;
	
	@CrossOrigin
	@RequestMapping("/aggregation")
	public String postAggregation(AggregationObj aggregationObj) {
		log.info("called /aggregation");
		log.info("payload: " + aggregationObj.toString());
		return chromeExtensionWSService.handleAggregation(aggregationObj);
	}
	
}
