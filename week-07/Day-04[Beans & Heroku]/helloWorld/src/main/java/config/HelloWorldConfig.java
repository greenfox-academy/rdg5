package config;


import com.greenfox.rdg5.helloworld.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorld sayHello() {

    return new HelloWorld();
  }

}
