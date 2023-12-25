package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.EmpAdd;
@Repository
public interface EmpAddRepo extends JpaRepository<EmpAdd, Integer>{

}
