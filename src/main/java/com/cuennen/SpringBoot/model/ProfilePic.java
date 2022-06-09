
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
@Table(name = "profilepic")
public class ProfilePic {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="pic_url")
    private String picUrl;
    
    @Column(name="urlBanner")
    private String urlBanner;
    
    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonBackReference
    private Persona person;

    public ProfilePic(long id, String picUrl, String urlBanner, Persona person) {
        this.id = id;
        this.picUrl = picUrl;
        this.person = person;
        this.urlBanner = urlBanner;
    }

    public ProfilePic() {
    }

    public ProfilePic(long id, String urlBanner, String picUrl) {
        this.id = id;
        this.picUrl = picUrl;
        this.urlBanner = urlBanner;
    }
    
    
}
