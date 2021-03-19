package com.chromeextensionws.dto;

public class AggregationObj {

	private String mediaType;
	private String linkUrl;
	private String srcUrl;
	private String pageUrl;
	private String frameUrl;
	private String selectionText;
	private String category;
	
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
	@Override
	public String toString() {
		return "AggregationObj [mediaType=" + mediaType + ", linkUrl=" + linkUrl + ", srcUrl=" + srcUrl + ", pageUrl="
				+ pageUrl + ", frameUrl=" + frameUrl + ", selectionText=" + selectionText + ", category=" + category
				+ "]";
	}
	
	
	
}
