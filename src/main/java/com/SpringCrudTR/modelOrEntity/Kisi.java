package com.SpringCrudTR.modelOrEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// A kind of pojo class
@Entity
@Table(name = "kisiler")
@Data
@NoArgsConstructor
public class Kisi {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String ad;
    private String soyad;
    private int yas;


}
