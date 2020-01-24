package com.example.mvcExample.repository;

import com.example.mvcExample.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}