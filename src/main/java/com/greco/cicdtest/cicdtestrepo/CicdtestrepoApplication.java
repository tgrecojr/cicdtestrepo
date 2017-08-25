package com.greco.cicdtest.cicdtestrepo;

import com.greco.cicdtest.cicdtestrepo.util.FakeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication(scanBasePackages={"com.greco.cicdtest.cicdtestrepo.*"})
@EnableAutoConfiguration
public class CicdtestrepoApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FakeBean fakeBean;

	public static void main(String[] args) {
		SpringApplication.run(CicdtestrepoApplication.class, args);
	}

	public void run(String[] args) throws Exception {
		logger.info("Starting Test Application");
		logger.info("FakeBean return: " + fakeBean.thisShouldReturnFive(""));
		logger.info("another message");
	}
}
