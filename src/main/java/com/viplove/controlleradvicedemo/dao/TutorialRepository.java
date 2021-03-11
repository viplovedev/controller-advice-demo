package com.viplove.controlleradvicedemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.viplove.controlleradvicedemo.model.Tutorial;

public interface TutorialRepository extends CrudRepository<Tutorial,Long>{

}
