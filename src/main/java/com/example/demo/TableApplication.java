package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
@EnableAutoConfiguration
public class TableApplication {
	@Autowired
	private TableDao dao;

	@GetMapping("/findall")
	public ResponseEntity<?> search() {
		Iterable<TableModel> res = dao.findAll();

		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(TableApplication.class, args);
	}
}