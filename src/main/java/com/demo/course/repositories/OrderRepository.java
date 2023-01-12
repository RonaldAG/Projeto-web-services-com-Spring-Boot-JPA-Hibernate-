package com.demo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
