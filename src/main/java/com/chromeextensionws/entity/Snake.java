package com.chromeextensionws.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Table(name = "all_snakes")
@Subselect("select * from all_snakes alsn where children=0 order by parent_tsn, tsn")
public class Snake {

	@Id
	private Integer tsn;

	private Integer parent_tsn;

	private String unit_name;

	private String common_name;

	private String geographic_value;

	private String jurisdiction_value;

	private String origin;

	private String rank_name;

	private Integer children;
	
	@Transient
	private String link;

	public Integer getTsn() {
		return tsn;
	}

	public void setTsn(Integer tsn) {
		this.tsn = tsn;
	}

	public Integer getParent_tsn() {
		return parent_tsn;
	}

	public void setParent_tsn(Integer parent_tsn) {
		this.parent_tsn = parent_tsn;
	}

	public String getUnit_name() {
		return unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public String getCommon_name() {
		return common_name;
	}

	public void setCommon_name(String common_name) {
		this.common_name = common_name;
	}

	public String getGeographic_value() {
		return geographic_value;
	}

	public void setGeographic_value(String geographic_value) {
		this.geographic_value = geographic_value;
	}

	public String getJurisdiction_value() {
		return jurisdiction_value;
	}

	public void setJurisdiction_value(String jurisdiction_value) {
		this.jurisdiction_value = jurisdiction_value;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getRank_name() {
		return rank_name;
	}

	public void setRank_name(String rank_name) {
		this.rank_name = rank_name;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	@PostLoad
	private void onLoad() {
		String un = (this.unit_name==null ? "" : this.unit_name);
	    this.link = "https://www.google.com/search?source=lnms&tbm=isch&q=" + un.replace(' ',  '+') + "&tsn=" + tsn;
		//this.link = "https://www.google.com/search?source=lnms&tbm=isch&q=regina+septemvittata";
	}
	
}
