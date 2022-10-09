package com.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Serializable>{
	public StockPrice findByCompanyname(String companyname);
}
