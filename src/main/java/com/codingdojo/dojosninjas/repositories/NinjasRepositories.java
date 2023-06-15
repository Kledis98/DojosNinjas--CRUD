package com.codingdojo.dojosninjas.repositories;

import com.codingdojo.dojosninjas.models.Ninjas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinjasRepositories extends CrudRepository<Ninjas,Long> {

        List<Ninjas> findAll();
}
