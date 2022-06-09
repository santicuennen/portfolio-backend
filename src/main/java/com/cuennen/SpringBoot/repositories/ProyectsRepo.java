
package com.cuennen.SpringBoot.repositories;

import com.cuennen.SpringBoot.model.Proyects;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ProyectsRepo extends JpaRepository<Proyects, Long>{
    
}
