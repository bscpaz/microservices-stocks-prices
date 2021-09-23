package br.com.bscpaz.microservices.stocksprices.services;

import java.util.List;
import java.util.Optional;

import br.com.bscpaz.microservices.stocksprices.models.StockPrice;

public interface StockPriceService {

	public List<StockPrice> findAll();
	
	public Optional<StockPrice> findByTicker(String ticker);
	
}
