
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
@Table(name = "proyects")
public class Proyects {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="title")
    private String title;
    @Column(name="url")
    private String url;
    @Column(name="yearDate")
    private int yearDate;
    @Column(name="description")
    private String description;

      
    
    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonBackReference
    private Persona person;

    public Proyects() {
    }

    public Proyects(long id, String title, String url, int yearDate, String description, Persona person) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.yearDate = yearDate;
        this.description = description;
        this.person = person;
    }

  

   
    
    
}
