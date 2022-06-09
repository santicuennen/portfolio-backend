
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Education;
import java.util.List;


public interface IEducationService {
    public List<Education> seeEduc();
    public void createEduc(Education edu);
    public void deleteEduc(long id);
    public Education searchEduc(long id);
    public void modifyEduc(Education edu);
}
