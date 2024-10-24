package com.example.rest_sqldemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface course_repo extends JpaRepository<course,Integer>{

}
