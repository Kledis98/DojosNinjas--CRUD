package com.codingdojo.dojosninjas.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dojos")
public class Dojos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "dojos" , fetch = FetchType.LAZY)
    private List<Ninjas> ninjas;





    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;


public Dojos(){

}

    public Dojos(Long id, String name, List<Ninjas> ninjas) {
        this.id = id;
        this.name = name;
        this.ninjas = ninjas;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ninjas> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<Ninjas> ninjas) {
        this.ninjas = ninjas;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
