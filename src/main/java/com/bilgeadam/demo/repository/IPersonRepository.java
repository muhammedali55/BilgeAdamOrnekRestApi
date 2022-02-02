package com.bilgeadam.demo.repository;

import com.bilgeadam.demo.repository.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPersonRepository extends JpaRepository<Person,Long> {

    // 1- find ile başlamalısınız
    // 2- DİKKKAT!!! Değişken isimlerini yazarken büyük küçük harf duyarlıdır.
    // yazım şekli kuralları şu şekildedir; tümü küçük harf ile yazılmış alanların Baş harflerı büyük yazılmalıdır.
    // 3- işleme tabi tutulacak değerler method parameteresi olarak girilmelidir. NOT! değişken adı ile aynı olmak zorunda değildir.
    List<Person> findByName(String name);
    List<Person> findByNameAndTckimlik(String name,String tckimlik);
    // Like, and, or, orderby, > <,

    Optional<Person> findOptionaByTckimlik(String tckimlik);

    // Optional ->
}
