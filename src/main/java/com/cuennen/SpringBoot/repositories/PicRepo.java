
package com.cuennen.SpringBoot.repositories;

import com.cuennen.SpringBoot.model.ProfilePic;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PicRepo extends JpaRepository<ProfilePic, Long>{
    
}
