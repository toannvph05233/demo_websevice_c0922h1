package com.demo_websevice_c0922h1.controller;

import com.demo_websevice_c0922h1.model.Blog;
import com.demo_websevice_c0922h1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Blog create(@RequestBody Blog blog){
        return blogService.save(blog);
    }

    @GetMapping("/{id}")
    public Blog showEdit(@PathVariable int id){
        return blogService.findById(id);
    }

    @PutMapping("/{id}")
    public Blog edit(@RequestBody Blog blog){
        return blogService.save(blog);
    }

    @DeleteMapping("/{id}")
    public Blog delete(@PathVariable int id){
        return blogService.delete(id);
    }

}
