
package com.cuennen.SpringBoot.repositories;


import com.cuennen.SpringBoot.model.Education;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface EducationRepo extends JpaRepository<Education, Long>{
    
}
