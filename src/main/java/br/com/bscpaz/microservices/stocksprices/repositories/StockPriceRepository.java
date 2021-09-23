package br.com.bscpaz.microservices.stocksprices.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bscpaz.microservices.stocksprices.models.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, String> {
	
	public Optional<StockPrice> findByTicker(String ticker);

}
