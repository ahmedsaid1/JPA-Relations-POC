package com.stc.relation.service;

import com.stc.relation.model.entity.Post;
import com.stc.relation.repository.PostRepo;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    PostRepo postRepo;


    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public Post addPost(Post post) {
        return postRepo.save(post);
    }

    public Post findPostById(Long id) {
        return postRepo.findById(id).get();
    }

}
