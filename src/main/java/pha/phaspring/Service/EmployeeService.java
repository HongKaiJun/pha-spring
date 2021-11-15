package pha.phaspring.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    

    public List<Employee> getEmployeeByEmpEmail(String empEmail){
        return employeeRepository.findByEmpEmail(empEmail);
    }

}
