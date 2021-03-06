package com.SpringCrudTR.controller;

import com.SpringCrudTR.modelOrEntity.Kisi;
import com.SpringCrudTR.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

// We need to do MAPPING in here
@RestController
public class KisiController {

    public KisiService kisiService;
    @Autowired
    public KisiController(KisiService kisiService){
        this.kisiService=kisiService;
    }

    @GetMapping(path="/kisiler")
    public List<Kisi> kisileriGetir(){
        return kisiService.tumKisilerGetir();
    }

    @PostMapping(path = "/kisiler/ekle")
    public Kisi yeniKisiEkle(@RequestBody Kisi kisi){
        return kisiService.kisiEkle(kisi);
    }

    // Id Ile Kisi yi getirme
    // Birden fazla ise @PathVariable("id"), tek ise @PathVariable
    @GetMapping(path = "/kisiler/{id}")
    public Optional<Kisi> idIleKisiListeleme(@PathVariable("id") Integer id){
        return kisiService.idIleKisiGetir(id);
    }
    @DeleteMapping(path = "/kisiler/sil/{id}")
    public String idIleKisiSil(@PathVariable Integer id){
        return kisiService.idIleKisiSil(id);
    }
    @PutMapping(path = "kisiler/guncelle/{id}")
    public Kisi idIleGuncelle(@PathVariable Integer id, @RequestBody Kisi yeniKisi){
        return kisiService.idIleKisiGuncelle(id,yeniKisi);
    }
}
