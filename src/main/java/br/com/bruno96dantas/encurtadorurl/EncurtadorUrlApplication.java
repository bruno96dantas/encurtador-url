package br.com.bruno96dantas.encurtadorurl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EncurtadorUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncurtadorUrlApplication.class, args);

		log.info("\n" +
				"\n" +
				"█████████\n" +
				"█▄█████▄█\n" +
				"█▼▼▼▼▼\n" +
				"█\n" +
				" Encurtador de URLs Started!\n" +
				"█▲▲▲▲▲\n" +
				"█████████\n" +
				" ██ ██\n" +
				"=================================================================================="		);
	}

}
