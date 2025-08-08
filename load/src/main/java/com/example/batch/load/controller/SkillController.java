package com.example.batch.load.controller;

import com.example.batch.load.entity.TnSkillUploadDetails;
import com.example.batch.load.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public ResponseEntity<List<TnSkillUploadDetails>> getAllData() {
        List<TnSkillUploadDetails> data = skillService.getAllData();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TnSkillUploadDetails> getById(@PathVariable Integer id) {
        return skillService.getById(id)
                .map(skill -> ResponseEntity.ok(skill))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<TnSkillUploadDetails> createOrUpdate(@RequestBody TnSkillUploadDetails skillDetails) {
        TnSkillUploadDetails savedSkill = skillService.saveOrUpdate(skillDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSkill);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        skillService.deleteById(id);
        return ResponseEntity.ok("Skill with id " + id + " deleted successfully");
    }

}
