package com.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

import com.spring.model.Genre;

public class GenreRepository extends JpaRepository<Genre, Long> {
	
    public Genre findByName(String name);
	
	Optional<Genre> findById(Long id);
	
	List<Genre> findAll();	
	
	void deleteById(Long id);
	
	
}
	  