package br.com.alelo.consumer.consumerpat.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@EqualsAndHashCode(of = "{id,documentNumber}")
public class Consumer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private  Integer documentNumber;
    private  Date birthDate;

    //contacts
    private  Integer mobilePhoneNumber;
    private Integer residencePhoneNumber;
    private  Integer phoneNumber;
    private  String email;

    //Address
    private  String street;
    private  Integer number;
    private  String city;
    private  String country;
    private  Integer portalCode;

}
