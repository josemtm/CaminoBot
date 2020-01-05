package com.camino.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.webcerebrium.binance.api.BinanceApi;
import com.webcerebrium.binance.api.BinanceApiException;

@Service
public class BinanceService implements IBinanceService {

	
	BinanceApi api = new BinanceApi();
	
	@Override
	public BigDecimal precioPar(String par) throws BinanceApiException  {
		// TODO Auto-generated method stub
			
		
				BigDecimal price = api.pricesMap().get(par);
				System.out.println(price);
				return price;
		
		
	}

	
	
}
