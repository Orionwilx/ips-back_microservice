package com.microservise.user.controller;

import com.microservise.user.entities.Comment;
import com.microservise.user.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Comment comment){
        commentService.save(comment);
    }

    @GetMapping("all")
    public ResponseEntity<?> findAllComments(){
        return ResponseEntity.ok(commentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(commentService.findById(id));
    }

    
}
