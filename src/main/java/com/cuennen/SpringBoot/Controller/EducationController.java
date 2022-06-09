
package com.cuennen.SpringBoot.Controller;

import com.cuennen.SpringBoot.model.Education;
import com.cuennen.SpringBoot.service.IEducationService;
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
public class EducationController {
    
    @Autowired
    private IEducationService eduSer; 
    
  
    @PostMapping("/new/edu")
    public void addEdu(@RequestBody Education edu){
        //listaPersonas.add(pers);
        eduSer.createEduc(edu);
}
    @GetMapping("/edus")
    @ResponseBody
    public List<Education> seeEdu(){
    return eduSer.seeEduc();    //return listaPersonas;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/edu/{id}")
    public void deleteEdu(
                              @PathVariable long id){
        eduSer.deleteEduc(id);
    }
    
    @GetMapping("/edu/{id}")
    public void searchEduc(
                              @PathVariable long id){
        eduSer.searchEduc(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modify/edu/{id}")
    public void modifyEdu(@PathVariable("id") long id, 
                          @RequestBody Education edu) 
            {
    eduSer.modifyEduc(edu);
}
    
}
