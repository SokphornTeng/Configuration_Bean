package Bean_Configuration.Practice_Bean_Configuration.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class book_family {

	@Bean
	public infor_list information() {
		return new infor_list();
	}
	
	@Bean
	public National_Card national() {
		return new National_Card(information());
	}
	
}
