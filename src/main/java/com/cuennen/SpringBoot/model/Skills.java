
package com.cuennen.SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    @Column(name="id")
    private long id;
    @Column(name="title")
    private String title;
    @Column(name="urlImg")
    private String urlImg;
    @Column(name="num")
    private int num;
   
    
    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonBackReference
    private Persona person;

    public Skills() {
    }

    public Skills(long id, String title, String urlImg, String percentage, Persona person) {
        this.id = id;
        this.title = title;
        this.urlImg = urlImg;       
        this.person = person;
    }
    
    
    

   
  
    
    
}

