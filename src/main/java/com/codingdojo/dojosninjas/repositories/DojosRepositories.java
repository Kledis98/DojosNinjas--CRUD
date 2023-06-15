package com.codingdojo.dojosninjas.repositories;

import com.codingdojo.dojosninjas.models.Dojos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojosRepositories extends CrudRepository<Dojos,Long> {
    List<Dojos> findAll();
}
