package com.example.batch.load.service;

import com.example.batch.load.entity.TnSkillUploadDetails;
import com.example.batch.load.repo.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public List<TnSkillUploadDetails> getAllData() {
        return skillRepository.findAll();
    }

    public Optional<TnSkillUploadDetails> getById(Integer id) {
        return skillRepository.findById(id);
    }

    public TnSkillUploadDetails saveOrUpdate(TnSkillUploadDetails skillDetails) {
        return skillRepository.save(skillDetails);
    }

    public void deleteById(Integer id) {
        skillRepository.deleteById(id);
    }
}
