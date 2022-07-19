package com.knoldus.Spring.Boot.CRUD.Operations.perform.on.persistence.storage.Repository;

import com.knoldus.Spring.Boot.CRUD.Operations.perform.on.persistence.storage.entity.Department;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface DepartmentRepository extends CrudRepository<Department, Long> {

    }
