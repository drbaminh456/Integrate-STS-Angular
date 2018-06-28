package com.example.demo;

import org.springframework.data.repository.CrudRepository;


public interface TableDao extends CrudRepository<TableModel, Integer> {

}
