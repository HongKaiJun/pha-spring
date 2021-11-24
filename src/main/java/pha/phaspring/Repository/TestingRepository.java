package pha.phaspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pha.phaspring.Model.Testing;

public interface TestingRepository extends JpaRepository <Testing,Integer> {
    
}
