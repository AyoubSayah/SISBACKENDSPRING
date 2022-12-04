package com.proxela.sis.bo.documents;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PostsList {

    private List<Post> postList;

    public PostsList(){
        postList = new ArrayList<>();
    }

}
