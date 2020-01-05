package com.camino.services;

import java.math.BigDecimal;

import com.webcerebrium.binance.api.BinanceApiException;


public interface IBinanceService {

	public BigDecimal precioPar(String par) throws BinanceApiException;
	
}
