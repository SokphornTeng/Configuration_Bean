package Bean_Configuration.Practice_Bean_Configuration.Bean_1;

import org.springframework.beans.factory.annotation.Autowired;

public class NBC {

	private wooriBank woori;
    @Autowired
	public NBC(wooriBank woori) {
		super();
		this.woori = woori;
	}
	
	
}
