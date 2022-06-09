
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
@Table(name = "education")
public class Education {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="title")
    private String title;
    @Column(name="type")
    private String type;    
    @Column(name="institution")
    private String institution;
    @Column(name="startDate")
    private int startDate;
    @Column(name="endDate")
    private int endDate;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonBackReference
    private Persona person;

    public Education() {
    }

    public Education(long id, String title, String institution, String type, int startDate, int endDate, Persona person) {
        this.id = id;
        this.title = title;
        this.institution = institution;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.person = person;
    }

  

    
}
