package com.chromeextensionws.service;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

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
		
		Map<String, String> linkUrlParams = null;
		Map<String, String> pageUrlParams = null;
		
		AggregationEntity aggregationEntity = modelMapper.map(aggregationObj, AggregationEntity.class);
		
		
		try {
			URL linkUrl = new URL(aggregationEntity.getLinkUrl());
			linkUrlParams = splitQuery(linkUrl);
			URL pageUrl = new URL(aggregationEntity.getPageUrl());			
			pageUrlParams = splitQuery(pageUrl);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  

		String imgurl = linkUrlParams.get("imgurl");
		String tsnString = pageUrlParams.get("tsn");
		
		aggregationEntity.setImageUrl(imgurl);
		aggregationEntity.setTsn(Integer.parseInt(tsnString));
		
		try {
			aggregationEntityRepository.save(aggregationEntity);	
		}
		catch(Exception e) {
			
		}
		
		
		return(aggregationObj.toString());
		
	}
	
	
	public Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
	    Map<String, String> query_pairs = new LinkedHashMap<String, String>();
	    String query = url.getQuery();
	    String[] pairs = query.split("&");
	    for (String pair : pairs) {
	        int idx = pair.indexOf("=");
	        query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
	    }
	    return query_pairs;
	}
	
}
