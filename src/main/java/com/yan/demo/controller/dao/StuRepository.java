package com.yan.demo.controller.dao;

import com.yan.demo.domain.Stu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepository extends JpaRepository<Stu,String> {
}
