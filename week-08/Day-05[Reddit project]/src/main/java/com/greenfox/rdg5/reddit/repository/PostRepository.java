package com.greenfox.rdg5.reddit.repository;

import com.greenfox.rdg5.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}