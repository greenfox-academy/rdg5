package com.greenfox.rdg5.todo.repository;

import com.greenfox.rdg5.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {


}
