package net.emergentdevelopers.springboot.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import net.emergentdevelopers.springboot.I9FormDeserializer;
import net.emergentdevelopers.springboot.model.I9Form;
import net.emergentdevelopers.springboot.repository.I9FormRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class I9FormController {
	
	@Autowired
	I9FormRepository i9formRepository;

	@PostMapping("/i9forms")
	public ResponseEntity<I9Form> createI9Form(@RequestBody I9Form i9form) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			SimpleModule module = new SimpleModule();
			module.addDeserializer(I9Form.class, new I9FormDeserializer());
			mapper.registerModule(module);
			
			I9Form _i9form = i9formRepository.save(i9form);
			return new ResponseEntity<>(_i9form, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
}
