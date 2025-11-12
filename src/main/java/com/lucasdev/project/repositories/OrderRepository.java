package com.lucasdev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
	