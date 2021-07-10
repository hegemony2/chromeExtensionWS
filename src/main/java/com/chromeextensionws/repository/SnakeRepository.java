package com.chromeextensionws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chromeextensionws.entity.Snake;

@Repository
public interface SnakeRepository extends JpaRepository<Snake, Integer> {

	
}
