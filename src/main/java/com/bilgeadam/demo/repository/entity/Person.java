package com.bilgeadam.demo.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "tblperson")
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@SequenceGenerator(name = "sq_tblperson_id",sequenceName = "sq_tblperson_id",initialValue = 1000,allocationSize = 1)
    //@GeneratedValue(generator = "sq_tblperson_id")
    long id;
    String name;
    long birddate;
    String tckimlik;
    int state;
}
