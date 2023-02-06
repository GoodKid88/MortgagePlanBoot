package com.example.MortgagePlanBoot.repositories;

import com.example.MortgagePlanBoot.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}