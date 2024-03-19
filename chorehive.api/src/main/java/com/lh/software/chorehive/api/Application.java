package com.lh.software.chorehive.api;

import com.lh.software.chorehive.api.web.config.DummyDataPopulator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		try {
			context.getBean(DummyDataPopulator.class).populateData();
			log.info("Dummy data loaded successfully");
		} catch (BeansException e) {
			throw new RuntimeException(e);
		}
		log.info("************************************ READY TO QUERY ************************************");
	}

}
