package com.stc.relation.service;

import com.stc.relation.model.entity.Tag;
import com.stc.relation.repository.TagRepo;
import org.springframework.stereotype.Service;

@Service
public class TagService {
    TagRepo tagRepo;

    public TagService(TagRepo tagRepo) {
        this.tagRepo = tagRepo;
    }
    public Tag addTag(Tag tag){
      return   tagRepo.save(tag);
    }
    public Tag getTag(Long id){
        return   tagRepo.findById(id).get();
    }
}
