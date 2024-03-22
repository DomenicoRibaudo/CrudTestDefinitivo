package com.develhope.CrudTestDefinitivo.repositories;

import com.develhope.CrudTestDefinitivo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
