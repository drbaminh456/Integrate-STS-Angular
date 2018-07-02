package com.example.dal;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Test;

public interface TestDao extends CrudRepository<Test, Integer> {

}