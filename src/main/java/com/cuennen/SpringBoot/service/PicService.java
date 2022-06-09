
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.ProfilePic;

import com.cuennen.SpringBoot.repositories.PicRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service @Transactional
public class PicService implements IPicService {
    @Autowired
    public PicRepo picrepo;
    
    
   

    @Override
    public void uploadPicture(ProfilePic pic) {
        picrepo.save(pic);
    }

    @Override
    public ProfilePic getPic(long id) {
      {
      return picrepo.findById(id).orElse(null);
    }
    }
    
}
