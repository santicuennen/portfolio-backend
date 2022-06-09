/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuennen.SpringBoot.Controller;


import com.cuennen.SpringBoot.model.Proyects;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cuennen.SpringBoot.service.IProyectsService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@RestController

public class ProyectsController {
    
    @Autowired
    
    private IProyectsService proyectSer;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/proy")
    public void addProyect(@RequestBody Proyects proy){
        //listaPersonas.add(pers);
        proyectSer.createProyect(proy);
}
    @GetMapping("/proyects")
    @ResponseBody
    public List<Proyects> seeProyects(){
    return proyectSer.seeProyects();    //return listaPersonas;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/proy/{id}")
    public void deleteProyect(@PathVariable long id){
        proyectSer.deleteProyect(id);
    }
    
    @GetMapping("/proyect/{id}")
    public Proyects searchProyect(@PathVariable long id) {
       return proyectSer.searchProyect(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modify/proyect/{id}")
    public void modifyProyect(@PathVariable("id") long id, 
                            @RequestBody Proyects proy) 
            {
    proyectSer.modifyProyect(proy);
    }
    
    
            
            
}
