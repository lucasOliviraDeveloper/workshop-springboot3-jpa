package com.lucasdev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
