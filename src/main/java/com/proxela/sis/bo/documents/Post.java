package com.proxela.sis.bo.documents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private String _id;
    private String userName;
    private String content;
    private String image;
    private boolean isPublished;
    private Date createdAt;
    private Date updatedAt;


}
