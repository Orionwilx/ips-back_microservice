package com.microservise.user.persistence;

import com.microservise.user.entities.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

    @Query("SELECT c FROM Comments c WHERE c.idcustomer = :customer")
    List<Comment> findCommentByCustomer(Long customer);

}
