package com.cee.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cee.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>  {

}
