package br.com.bscpaz.microservices.stocksprices.controllers.v1.dtos;

import java.util.List;
import java.util.stream.Collectors;

import br.com.bscpaz.microservices.stocksprices.models.StockPrice;

public class StockPriceDto {

	private String ticker;
	private String price;
	private String currency;

	public StockPriceDto() { }	
	
	public StockPriceDto(StockPrice stockPrice) {
		this.ticker = stockPrice.getTicker();
		this.price = String.valueOf(stockPrice.getPrice());
		this.currency = stockPrice.getCurrency();
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public static List<StockPriceDto> convert(List<StockPrice> stocksPrices) {
		return stocksPrices.stream().map(StockPriceDto::new).collect(Collectors.toList());
	}

}
