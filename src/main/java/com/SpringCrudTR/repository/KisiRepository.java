package com.SpringCrudTR.repository;

import com.SpringCrudTR.modelOrEntity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

// If an interface get parameter, it is called generic class or interface
// It takes 2 parameter, DATA TYPES which comes from model, and PRIMARY KEY TYPE
public interface KisiRepository extends JpaRepository<Kisi,Integer> {

}
