package pha.phaspring.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pha.phaspring.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Integer>{



  
  Employee findByEmpEmail(String empEmail);

  Employee findByempEmail (String empEmail);
}



 