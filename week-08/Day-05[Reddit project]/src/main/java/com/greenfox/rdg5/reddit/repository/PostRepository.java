package com.greenfox.rdg5.reddit.repository;

import com.greenfox.rdg5.reddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Query(value = "SELECT * FROM post ORDER BY post_rank DESC", nativeQuery = true)
    public List<Post> listDesc();

}