package com.test.MyProject;

import com.test.MyProject.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<CustomerEntity, Integer> {
    List<CustomerEntity> findAll();
    // You can define additional query methods here if needed
}

