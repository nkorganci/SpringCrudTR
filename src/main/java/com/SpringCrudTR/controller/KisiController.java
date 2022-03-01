package com.SpringCrudTR.controller;

import com.SpringCrudTR.modelOrEntity.Kisi;
import com.SpringCrudTR.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
