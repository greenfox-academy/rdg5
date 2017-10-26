package config;

import com.greenfox.rdg5.helloworld.Black;
import com.greenfox.rdg5.helloworld.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

  @Bean
  public Red coloringRed() {

    return new Red();
  }

  @Bean
  public Black coloringBlack() {
    return new Black();
  }
}
