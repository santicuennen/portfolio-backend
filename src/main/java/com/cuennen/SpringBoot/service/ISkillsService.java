
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.Skills;
import java.util.List;

public interface ISkillsService {
    public List<Skills> seeSkills();
    public void createSkill(Skills skill);
    public void deletSkill(long id);
    public Skills searchSkill (long id);
    public void modifySkill(Skills skill);

}
