package com.greenfox.rdg5.connectionwithmysql.repository;

import com.greenfox.rdg5.connectionwithmysql.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

//  @Autowired
//  static void save() {
//  }

//  public List<Todo> findAllByIsUrgent();
}