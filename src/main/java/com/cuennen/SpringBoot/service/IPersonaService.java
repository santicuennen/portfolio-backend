
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> seePerson();
    public void crearpersona(Persona pers);
    public void borrarPersona(long id);
    public Persona buscarPersona (long id);
    public void modificarPersona(Persona pers);
    public void patchPersona (Persona pers);
   
}
