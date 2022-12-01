package com.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

import com.spring.model.Actor;

public class ActorRepository extends JpaRepository<Actor, Long> {
	
	public Actor findByName(String name);
	
	Optional<Actor> findById(Long id);
	
	List<Actor> findAll();

	void deleteById(Long id);
}
	