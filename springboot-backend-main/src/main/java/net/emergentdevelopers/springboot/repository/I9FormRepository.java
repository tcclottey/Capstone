package net.emergentdevelopers.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import net.emergentdevelopers.springboot.model.I9Form;


public interface I9FormRepository extends JpaRepository<I9Form, Long> {
	Optional<I9Form> findByid(String emailAddress);
    
    Boolean  findByCompletedIsTrue();

	@SuppressWarnings("unchecked")
	I9Form save(I9Form i9Form);
}