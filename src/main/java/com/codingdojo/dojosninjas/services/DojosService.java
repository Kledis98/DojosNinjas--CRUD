package com.codingdojo.dojosninjas.services;

import com.codingdojo.dojosninjas.models.Dojos;
import com.codingdojo.dojosninjas.models.Ninjas;
import com.codingdojo.dojosninjas.repositories.DojosRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DojosService {
    @Autowired
    private DojosRepositories dojosRepositories;

    public List<Dojos> allDojos(){
        return dojosRepositories.findAll();
    }

    public Dojos createDojos(Dojos dojos){
        return dojosRepositories.save(dojos);
    }

    public Dojos findDojo(Long id){
        return dojosRepositories.findById(id).orElse(null);
    }
}
