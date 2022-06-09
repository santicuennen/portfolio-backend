
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cuennen.SpringBoot.repositories.PersonaRepo;
import javax.transaction.Transactional;

@Service @Transactional 
public class PersonaService implements IPersonaService{

    
    @Autowired
    public PersonaRepo persoRepo;
    
    
    @Override
    public List<Persona> seePerson() {
        return persoRepo.findAll();
    }

    @Override
    public void crearpersona(Persona pers) {
         persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(long id) {
      return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void patchPersona(Persona pers) {
        persoRepo.save(pers);
        
    }


    
    
}
