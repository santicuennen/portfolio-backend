
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Proyects;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cuennen.SpringBoot.repositories.ProyectsRepo;

@Service @Transactional
public class ProyectsService implements IProyectsService {
    
  @Autowired
    public ProyectsRepo proyectRepo;
    
    @Override
    public List<Proyects> seeProyects() {
        return proyectRepo.findAll();
    }

    @Override
    public void createProyect(Proyects proyect) {
        proyectRepo.save(proyect);
    }

    @Override
    public void deleteProyect(long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyects searchProyect(long id) {
       return proyectRepo.findById(id).orElse(null);
    }

    @Override
    public void modifyProyect(Proyects proyect) {
       proyectRepo.save(proyect);
    }
    
}
