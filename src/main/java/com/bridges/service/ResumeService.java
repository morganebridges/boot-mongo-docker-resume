package com.bridges.service;

import com.bridges.model.resume.Resume;
import com.bridges.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {
    private ResumeRepository rRepo;
    private MongoIdService sequenceService;

    public ResumeService(@Autowired ResumeRepository rRepo,@Autowired MongoIdService sequenceService ){
        this.rRepo = rRepo;
        this.sequenceService = sequenceService;
    }

    public Resume getById(Long id){
        return rRepo.findOne(id);
    }

    public List<Resume> getAll(){
        return rRepo.findAll();
    }



    public Resume save(Resume resume){
        if(resume.getId() == null){
            resume.setId(sequenceService.getNextSequence("resumeId"));
            rRepo.save(resume);

        }else{
            rRepo.save(resume);
        }
        return rRepo.save(resume);
    }

}
