DO $$

BEGIN
	
	CREATE TABLE IF NOT EXISTS stocks.tb_stocks_prices (
    		ticker character varying(8) UNIQUE NOT NULL,
    		price numeric NULL,
		currency character(5) NOT NULL,
		dt_updated timestamp without time zone,
    	CONSTRAINT tb_stocks_prices_pk PRIMARY KEY (ticker)
	) TABLESPACE pg_default;
																							
END $$;	