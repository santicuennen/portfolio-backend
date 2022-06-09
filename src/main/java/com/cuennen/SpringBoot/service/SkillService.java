/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Skills;
import com.cuennen.SpringBoot.repositories.SkillsRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service @Transactional
public class SkillService implements ISkillsService {

    @Autowired
    private SkillsRepo skillRepo;
    
    @Override
    public List<Skills> seeSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void createSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deletSkill(long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skills searchSkill(long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void modifySkill(Skills skill) {
        skillRepo.save(skill);
    }
    
}
