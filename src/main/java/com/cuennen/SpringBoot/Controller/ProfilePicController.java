
package com.cuennen.SpringBoot.Controller;


import com.cuennen.SpringBoot.model.ProfilePic;
import com.cuennen.SpringBoot.service.IPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProfilePicController {
 @Autowired
 public IPicService picser;
    
 
    @GetMapping("/pictures/{id}")    
    public ProfilePic getPic(@PathVariable long id){
    return picser.getPic(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/upload/picture/{id}")      
    public void addPicture(@PathVariable long id,
                           @RequestBody ProfilePic pic)
            {
        picser.uploadPicture(pic);
    }
}

