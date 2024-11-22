package com.microservise.user.service;

import com.microservise.user.entities.Comment;

import java.util.List;

public interface ICommentService {

    List<Comment> findAll();

    Comment findById(Long id);

    void save(Comment comment);

}
