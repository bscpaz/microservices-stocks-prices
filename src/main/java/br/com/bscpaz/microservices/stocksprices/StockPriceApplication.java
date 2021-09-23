package br.com.bscpaz.microservices.stocksprices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class StockPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPriceApplication.class, args);
	}

}
