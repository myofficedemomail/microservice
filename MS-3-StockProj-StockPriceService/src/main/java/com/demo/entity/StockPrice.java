package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK_PRICE")
public class StockPrice {
	@Id
	@Column(name = "STOCK_ID")
	private Integer stockid;
	@Column(name = "COMPANY_NAME")
	private String companyname;
	@Column(name = "STOCK_PRICE")
	private Double stockprice;

	public Integer getStockid() {
		return stockid;
	}

	public void setStockid(Integer stockid) {
		this.stockid = stockid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Double getStockprice() {
		return stockprice;
	}

	public void setStockprice(Double stockprice) {
		this.stockprice = stockprice;
	}

}
