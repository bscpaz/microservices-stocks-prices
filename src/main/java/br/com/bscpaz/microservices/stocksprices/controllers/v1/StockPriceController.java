package br.com.bscpaz.microservices.stocksprices.controllers.v1;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bscpaz.microservices.stocksprices.base.ApiVersions;
import br.com.bscpaz.microservices.stocksprices.controllers.v1.dtos.StockPriceDto;

@RequestMapping(
	path = ApiVersions.V1 + StockPriceController.PATH, 
	produces = MediaType.APPLICATION_JSON_VALUE)
public interface StockPriceController {

	public final static String PATH = "/stocks-prices";
	
	@GetMapping
	public ResponseEntity<List<StockPriceDto>> getStocksPrices();	
	
	@GetMapping("/{ticker}")
	public ResponseEntity<StockPriceDto> getStockPrice(@PathVariable String ticker);	
	
}
