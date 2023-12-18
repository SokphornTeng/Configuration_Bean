package Bean_Configuration.Practice_Bean_Configuration.Bean_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext bean = new AnnotationConfigApplicationContext();
		bean.register(wooriBank.class);
		bean.refresh();
		bean.close();

	}

}
