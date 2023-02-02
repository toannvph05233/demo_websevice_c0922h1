package com.demo_websevice_c0922h1.controller;

import com.demo_websevice_c0922h1.model.Blog;
import com.demo_websevice_c0922h1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping
    public Page<Blog> getAll(){
        return blogService.getAll(PageRequest.of(0,2));
    }

}
