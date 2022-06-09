
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Education;
import com.cuennen.SpringBoot.repositories.EducationRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service @Transactional
public class EducationService implements IEducationService {
    
    @Autowired
    public EducationRepo eduRepo;

    @Override
    public List<Education> seeEduc() {
       return eduRepo.findAll();
           }

    @Override
    public void createEduc(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEduc(long id) {
        eduRepo.deleteById(id);
    }

    @Override    
    public Education searchEduc(long id) {
      return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void modifyEduc(Education edu) {
        eduRepo.save(edu);
    }
    
    
}
