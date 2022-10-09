package com.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.StockPriceService;

@RestController
public class StockPriceRestController {
	@Autowired
	private StockPriceService stockPriceService;
	@GetMapping("/stockprice/{companyname}")
	public ResponseEntity<String> getPrice(@PathVariable(name = "companyname") String companyname){
		Double stockPrice=stockPriceService.stockPrice(companyname);
		return new ResponseEntity<String>(stockPrice.toString(), HttpStatus.OK);
	}
}
