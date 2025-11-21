package com.lucasdev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.project.entities.OrderItem;
import com.lucasdev.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}