package Bean_Configuration.Practice_Bean_Configuration.Bean_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bean_configuration {

	@Bean
	public wooriBank wbfinance() {
		return new wooriBank();
	}
	
	@Bean
	public NBC national_bank() {
		return new NBC(wbfinance());
	}
}
