package com.jsp.Intime.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Intime.Entity.Homeproduct;

@Repository
public interface HomeProductsRepository extends JpaRepository<Homeproduct,  Integer> {

}
