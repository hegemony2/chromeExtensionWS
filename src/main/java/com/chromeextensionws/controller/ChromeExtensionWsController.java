package com.chromeextensionws.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chromeextensionws.dto.AggregationObj;
import com.chromeextensionws.entity.Snake;
import com.chromeextensionws.repository.SnakeRepository;
import com.chromeextensionws.service.ChromeExtensionWSService;

//@RestController
@Controller
public class ChromeExtensionWsController {

    Logger log = LoggerFactory.getLogger(ChromeExtensionWsController.class);

	
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
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/snakes")
	public String snakes(Model model) {
		List<Snake> listSnake = snakeRepository.findAll();
		model.addAttribute("listSnake", listSnake);
		return "snakes";
	}
	
}
