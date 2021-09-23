package br.com.bscpaz.microservices.stocksprices.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bscpaz.microservices.stocksprices.models.StockPrice;
import br.com.bscpaz.microservices.stocksprices.repositories.StockPriceRepository;
import br.com.bscpaz.microservices.stocksprices.services.StockPriceService;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository repository;
	
	@Override
	public List<StockPrice> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<StockPrice> findByTicker(String ticker) {
		return repository.findByTicker(ticker);
	}

}
