package pha.phaspring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import pha.phaspring.Model.Employee;
import pha.phaspring.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;


    public List <Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    

    public ResponseEntity <Employee> getEmployeeId (Integer Id){
        Employee employee = employeeRepository.findById(Id).orElseThrow();
        return ResponseEntity.ok(employee);
    }

    public List<Employee> getByEmployeeID (Integer Id){
        return employeeRepository.queryBy(Id);
        
    }


}
