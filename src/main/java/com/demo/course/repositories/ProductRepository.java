package com.demo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
