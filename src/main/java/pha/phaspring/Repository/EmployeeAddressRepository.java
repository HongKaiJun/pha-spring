package pha.phaspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pha.phaspring.Model.EmployeeAddress;

@Repository
public interface EmployeeAddressRepository extends JpaRepository <EmployeeAddress, Integer> {
    
}
