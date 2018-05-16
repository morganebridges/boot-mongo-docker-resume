package com.bridges.repository;

import com.bridges.model.resume.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeRepository extends MongoRepository<Resume, Long> {
}
