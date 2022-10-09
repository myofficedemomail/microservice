package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockUiService {
	public String getTotalStockPrice(String companyName, String qty) {
		String response ="";
		String REST_ENDPOINT = "http://localhost:9091/calculate/{companyname}/{qty}";
		try {
			WebClient webClient = WebClient.create();
			response = webClient.get().uri(REST_ENDPOINT, companyName, qty).retrieve().bodyToMono(String.class)
					.block();
		}catch (Exception e) {
			response="Error In Input Value"; 
		}
		return response;
	}
}
