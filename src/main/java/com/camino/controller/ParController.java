package com.camino.controller;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camino.services.BinanceService;
import com.webcerebrium.binance.api.BinanceApiException;


@RestController
@RequestMapping("/pares")
@CrossOrigin(origins = "*")
public class ParController {
	
	@Autowired
	BinanceService binanceService;
	
	@Autowired
	BinanceService ParService;
	


	@RequestMapping(value ="/precio/{par}")
	public BigDecimal precioPar(@PathVariable(value = "par")String par) throws BinanceApiException{
		System.out.println(par);
		return binanceService.precioPar(par);
	}
	
}
