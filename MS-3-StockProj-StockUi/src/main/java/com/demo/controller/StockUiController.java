package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.service.StockUiService;

@Controller
public class StockUiController {
	@Autowired
	private StockUiService stockUiService;
	@GetMapping("/")
	public String loadForm() {
		return "index";
	}
	@GetMapping("/buy")
	public String buyStock(@RequestParam("companyname") String companyname,@RequestParam("qty") String qty,Model model) {
		String res=stockUiService.getTotalStockPrice(companyname, qty);
		System.out.println(res+"======================================");
		System.out.println(companyname+"--"+qty);
		model.addAttribute("msg", res);
		return "index";
	}
}
