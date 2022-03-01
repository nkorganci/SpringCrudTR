package com.SpringCrudTR.service;

import com.SpringCrudTR.modelOrEntity.Kisi;
import com.SpringCrudTR.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KisiService {

    public static KisiRepository kisiRepository;

    // Dependency Injection
    @Autowired // it create KisiRepository when he needs it or object created, to have better memory management
    public KisiService(KisiRepository kisiRepository){
        KisiService.kisiRepository =kisiRepository;
        // this.kisiRepository=kisiRepository; // If it would not be static
    }

    public List<Kisi> tumKisilerGetir(){
        return kisiRepository.findAll();
    }

    // Veri tabanina Kisi ekleyen servis metodu
    public Kisi kisiEkle(Kisi kisi){
        //System.out.println("Kisi Eklendi de yazdirilabilir.");
        return kisiRepository.save(kisi);
    }
}
