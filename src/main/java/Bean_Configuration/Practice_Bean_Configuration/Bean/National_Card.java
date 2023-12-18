package Bean_Configuration.Practice_Bean_Configuration.Bean;

import org.springframework.beans.factory.annotation.Autowired;

public class National_Card {

	private infor_list info;
    @Autowired
	public National_Card(infor_list info) {
		super();
		this.info = info;
	}
	
	
}
