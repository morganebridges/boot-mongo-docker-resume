package com.bridges.controller;

import com.bridges.model.resume.Resume;
import com.bridges.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/resume")
public class ResumeController {
    private ResumeService rService;

    public ResumeController(@Autowired ResumeService rService){this.rService = rService;}

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Resume> getResumes(){
        return rService.getAll();
    }

    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
    public Resume getResume(@PathVariable Long id){
        return rService.getById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveResumes(@RequestBody List<Resume> resumes){
       resumes.forEach(resume -> rService.save(resume));

    }

}
