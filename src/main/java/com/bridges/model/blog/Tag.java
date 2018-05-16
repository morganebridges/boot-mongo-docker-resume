package com.bridges.model.blog;

import com.sun.istack.internal.Nullable;
import org.springframework.data.annotation.Id;

import java.util.TreeMap;

public class Tag {
    @Id
    @Nullable
    private long id;

    private String name;

    private TreeMap associations;

    public Tag(String name){
        this.name = name;
    }
    public Tag(String name, Long id){
        this.name = name;
        this.id = id;
    }

}
