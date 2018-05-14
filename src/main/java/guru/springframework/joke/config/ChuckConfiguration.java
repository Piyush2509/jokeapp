package guru.springframework.joke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by piyush.b.kumar on May 14, 2018.
 */
@Configuration
public class ChuckConfiguration {
	
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}
