
package com.cuennen.SpringBoot.model;
import com.fasterxml. jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Setter;
import lombok.Getter;


@Getter @Setter
@Entity
@Table(name = "person")
public class Persona {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="lastname")
    private String lastname;
    @Column(name="about")
    private String about;
    @Column(name="aboutMe")
    private String aboutMe;   
    @Column(name="country")
    private String country;
    @Column(name="location")
    private String location;   
    
 
    @OneToMany(mappedBy = "person")
    @JsonManagedReference
    private List<Education> education;
    @OneToMany(mappedBy = "person")
    @JsonManagedReference
    private List<Skills> skills;    
    @OneToMany(mappedBy = "person")
    @JsonManagedReference
    private List<Proyects> proyects;
  
    
    
    public Persona(){
        
    }

    public Persona(long id, String name, String lastname, String about, String country, String location, String aboutMe) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
      
        this.about = about;    
        this.country = country;
        this.location = location;        
        this.aboutMe = aboutMe;
    }

   
 
 
  
  
    
}
