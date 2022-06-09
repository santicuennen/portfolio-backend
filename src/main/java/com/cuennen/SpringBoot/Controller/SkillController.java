
package com.cuennen.SpringBoot.Controller;

import com.cuennen.SpringBoot.model.Skills;
import com.cuennen.SpringBoot.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SkillController {
    
    @Autowired
    private ISkillsService skillSer;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/skill")
    public void addSkill(@RequestBody Skills skill){
        //listaPersonas.add(pers);
        skillSer.createSkill(skill);
}
    @GetMapping("/skills")
    @ResponseBody
    public List<Skills> seeSkills(){
    return skillSer.seeSkills();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/skill/{id}")
    public void deleteSkill(
                              @PathVariable long id){
        skillSer.deletSkill(id);
    }
    
    @GetMapping("/skill/{id}")
    public void searchSkill(
                              @PathVariable long id){
        skillSer.searchSkill(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modify/skill/{id}")
    public void modifySkill(@PathVariable("id") long id, 
                            @RequestBody Skills skill) 
            {
    skillSer.modifySkill(skill);
    }
    
}
