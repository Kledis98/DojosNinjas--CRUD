package com.codingdojo.dojosninjas.services;

import com.codingdojo.dojosninjas.models.Ninjas;
import com.codingdojo.dojosninjas.repositories.NinjasRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjasService {
    @Autowired
    private NinjasRepositories ninjasRepositories;

    public List<Ninjas> allNinjas(){
        return ninjasRepositories.findAll();
    }

    public Ninjas createNinja(Ninjas ninjas){
       return ninjasRepositories.save(ninjas);
    }
}
