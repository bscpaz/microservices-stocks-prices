package br.com.bscpaz.microservices.stocksprices.controllers.v1.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.bscpaz.microservices.stocksprices.controllers.v1.StockPriceController;
import br.com.bscpaz.microservices.stocksprices.controllers.v1.dtos.StockPriceDto;
import br.com.bscpaz.microservices.stocksprices.models.StockPrice;
import br.com.bscpaz.microservices.stocksprices.services.StockPriceService;

@RestController
public class StockPriceControllerImpl implements StockPriceController {

	@Autowired
	private StockPriceService stockPriceService;
	
	@Override
	public ResponseEntity<List<StockPriceDto>> getStocksPrices() {
		List<StockPriceDto> stocksPrices = StockPriceDto.convert(stockPriceService.findAll());
		return new ResponseEntity<>(stocksPrices, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<StockPriceDto> getStockPrice(String ticker) {
		Optional<StockPrice> optional = stockPriceService.findByTicker(ticker);
		
		if (optional.isPresent()) {
			StockPriceDto stockPriceDto = new StockPriceDto(optional.get());
			return ResponseEntity.ok(stockPriceDto);
		}
		return ResponseEntity.notFound().build();
	}

}
