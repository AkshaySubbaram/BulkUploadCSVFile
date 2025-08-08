package com.example.batch.load.repo;

import com.example.batch.load.entity.TnSkillUploadDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<TnSkillUploadDetails, Integer> {

}
