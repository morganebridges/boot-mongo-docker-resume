package com.bridges.model.resume;

import com.bridges.model.resume.Experience;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Resume {

    @Id
    private Long id;
    private String name;
    private String resAbstract;
    private String location;
    private List<Experience> experience;
    private List<Education> education;


    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResAbstract() {
        return resAbstract;
    }

    public void setResAbstract(String resAbstract) {
        this.resAbstract = resAbstract;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
