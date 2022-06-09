
package com.cuennen.SpringBoot.Controller;

import com.cuennen.SpringBoot.model.Persona;
import com.cuennen.SpringBoot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
//para permitir metodos cors
@RestController
//la forma de que springboot entienda que esta clase es la controladora
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private IPersonaService personServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/person")
    public void addPersons(@RequestBody Persona pers){
        //listaPersonas.add(pers);
        personServ.crearpersona(pers);
}
    @GetMapping("/persons")
    @ResponseBody
    public List<Persona> seePerson(){
    return personServ.seePerson();    //return listaPersonas;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/person/{id}")
    public void borrarPersona(
                              @PathVariable long id){
        personServ.borrarPersona(id);
    }
    @GetMapping("/person/{id}")
     public Persona buscarPersona(@PathVariable long id) {
      return personServ.buscarPersona(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modify/person/{id}")
    public void modifyPerson(@PathVariable long id,
                             @RequestBody Persona pers)
            {
        personServ.modificarPersona(pers);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PatchMapping("/patch/person/{id}")
    public void patchPerson(@PathVariable long id,
                            @RequestBody Persona pers)
            {
        personServ.patchPersona(pers);
    }
            
            
}
