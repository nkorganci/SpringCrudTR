package com.SpringCrudTR.repository;

import com.SpringCrudTR.modelOrEntity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// If an interface get parameter, it is called generic class or interface
// It takes 2 parameter, DATA TYPES which comes from model or Entity, and PRIMARY KEY TYPE for ID
@Repository
public interface KisiRepository extends JpaRepository<Kisi,Integer> {

}
