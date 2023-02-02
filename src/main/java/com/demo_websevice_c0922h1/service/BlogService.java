package com.demo_websevice_c0922h1.service;


import com.demo_websevice_c0922h1.model.Blog;
import com.demo_websevice_c0922h1.repository.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class BlogService {
    @Autowired
    IBlogRepo iBlogRepo;

    public Page<Blog> getAll(Pageable pageable) {
        return iBlogRepo.findAll(pageable);
    }

    public Blog save(Blog blog) {
        return iBlogRepo.save(blog);
    }

    public Blog delete(int id) {
        Blog blog = findById(id);
        iBlogRepo.deleteById(id);
        return blog;
    }

    public Blog findById(int id) {
        return iBlogRepo.findById(id).get();
    }

}
