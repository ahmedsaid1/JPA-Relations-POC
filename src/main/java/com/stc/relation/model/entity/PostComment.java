package com.stc.relation.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "PostComment")
@Table(name = "post_comment")
@Data
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String review;

    @JoinColumn(name = "post_id")
    @ManyToOne(fetch = FetchType.LAZY)

    private Post post;


}