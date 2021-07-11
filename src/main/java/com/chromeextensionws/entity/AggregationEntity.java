package com.chromeextensionws.entity;

import javax.persistence.Entity;

@Entity
public class AggregationEntity extends EntityWithUUID {

	private String mediaType;
	private String linkUrl;
	private String srcUrl;
	private String pageUrl;
	private String frameUrl;
	private String selectionText;
	private String category;
	private String imageUrl;
	private Integer tsn;
	
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public String getSrcUrl() {
		return srcUrl;
	}
	public void setSrcUrl(String srcUrl) {
		this.srcUrl = srcUrl;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getFrameUrl() {
		return frameUrl;
	}
	public void setFrameUrl(String frameUrl) {
		this.frameUrl = frameUrl;
	}
	public String getSelectionText() {
		return selectionText;
	}
	public void setSelectionText(String selectionText) {
		this.selectionText = selectionText;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Integer getTsn() {
		return tsn;
	}
	public void setTsn(Integer tsn) {
		this.tsn = tsn;
	}
	
	
	
	
}
