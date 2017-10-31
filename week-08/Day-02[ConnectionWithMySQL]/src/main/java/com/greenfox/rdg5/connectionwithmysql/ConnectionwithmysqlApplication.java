package com.greenfox.rdg5.connectionwithmysql;

import com.greenfox.rdg5.connectionwithmysql.model.Todo;
import com.greenfox.rdg5.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Buy food for the hedgies", true, false));
    todoRepository.save(new Todo("Wash the dishes", true, true));
    todoRepository.save(new Todo("Buy food for myself", false, false));
  }

}
