/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cuennen.SpringBoot.service;

import com.cuennen.SpringBoot.model.ProfilePic;

/**
 *
 * @author scuen
 */
public interface IPicService {
     public ProfilePic getPic (long id);
     public void uploadPicture(ProfilePic pic);
}
