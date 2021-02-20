package com.github.eduarduhh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.eduarduhh.api.entitiy.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
