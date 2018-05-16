package com.bridges.model.blog;

import com.sun.istack.internal.Nullable;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Post {
    //Required
    private String content;
    private String title;

    //Optional but empty default
    private List<Tag> tags = new ArrayList<>();

    //Optional
    @Nullable
    private String subtitle;

    @Nullable
    @Id
    private Long id;

    public Post(Long id, String title, String content, List<Tag> tags, String subtitle){
        this.id = id;
        this.title = title;
        this.tags = tags;
        this.subtitle = subtitle;
        this.content = content;
    }

    public Post(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static class Builder {
        private String title;
        private String content;
        private Long id = null;
        private String subtitle = null;
        private List<Tag> tags = new ArrayList<>();


        public Builder addTag(Tag tag){
            tags.add(tag);
            return this;
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder tags(List<Tag> tags){
            this.tags = tags;
            return this;
        }

        public Post build(){
            if(this.content == null || this.title == null){
                throw new IllegalStateException("Content and Title are not optional fields");
            }
            else{
                return new Post(id, title, content, tags, subtitle);
            }
        }

    }
}
