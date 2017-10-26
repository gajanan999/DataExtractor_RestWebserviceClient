package com.dataExtractor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;


import com.dataExtractor.models.Response;

@SpringBootApplication
public class DataExtractorApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(DataExtractorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DataExtractorApplication.class, args);
	
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	
	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		
			Data quote = restTemplate.getForObject(
					"http://gturnquist-quoters.cfapps.io/api/random", Data.class);
			log.info(quote.toString());
		
	}*/
	
	public void run(String... args) throws Exception { 
		
		RestTemplate restTemplate = new RestTemplate();
		Response response = restTemplate.getForObject( "http://localhost:9000/hello-world", Response.class);
		Map<String, ?> m =new HashMap<>();
		Response response1= restTemplate.getForObject("http://localhost:9000/hello-world",Response.class,m);
		
		log.info("==== RESTful API Response using Spring RESTTemplate START ======="); 
		log.info(response.toString());
		log.info(response1.toString());
		Iterator<String> it=m.keySet().iterator();
		while(it.hasNext()) {
			
			String o=(String) it.next();
			log.info(o);
			System.out.println(o);
			System.out.println(m.get(o));
			log.info((String) m.get(o));
		}
		log.info("dfsfsd");
				
		log.info("==== RESTful API Response using Spring RESTTemplate END =======");
		
	}

	
}
