
package com.cuennen.SpringBoot.repositories;

import com.cuennen.SpringBoot.model.Persona;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface PersonaRepo extends JpaRepository<Persona, Long>{
    
}
