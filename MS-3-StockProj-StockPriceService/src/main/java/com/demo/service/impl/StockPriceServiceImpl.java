package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.StockPrice;
import com.demo.exception.CompanyNotFoundException;
import com.demo.repo.StockPriceRepo;
import com.demo.service.StockPriceService;
@Service
public class StockPriceServiceImpl implements StockPriceService {
	@Autowired
	private StockPriceRepo stockPriceService;
	@Override
	public Double stockPrice(String companyName) {
		StockPrice stockPrice=stockPriceService.findByCompanyname(companyName.toUpperCase());
		if(stockPrice==null) {
			throw new CompanyNotFoundException("Company Not Available");
		}
		return stockPrice.getStockprice();
	}

}
