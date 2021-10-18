package com.stc.relation.endpoints;

import com.stc.relation.model.entity.Tag;
import com.stc.relation.service.TagService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tags")
public class TagController {
    TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @PostMapping
public Tag addTag(@RequestBody Tag tag){
    return tagService.addTag(tag);
}
    @GetMapping("/{id}")
    public Tag GetById(@PathVariable Long id){
        return tagService.getTag(id);
    }

}
