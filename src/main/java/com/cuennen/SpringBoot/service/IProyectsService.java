
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Proyects;
import java.util.List;


public interface IProyectsService {
    public List<Proyects> seeProyects();
    public void createProyect(Proyects proyect);
    public void deleteProyect(long id);
    public Proyects searchProyect(long id);
     public void modifyProyect(Proyects proyect);
    
}
