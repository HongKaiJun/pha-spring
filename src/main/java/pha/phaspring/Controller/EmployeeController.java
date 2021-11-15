package pha.phaspring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pha.phaspring.Model.Employee;
import pha.phaspring.Response.EmployeeResponse;
import pha.phaspring.Service.EmployeeService;



@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    

    @GetMapping("employee")
    public List <EmployeeResponse> getAllEmployeesInTable(){
        
        List<Employee> employeeList = employeeService.getAllEmployees();
        List<EmployeeResponse> employeeResponselist = new ArrayList<EmployeeResponse>();

        employeeList.stream().forEach(employee ->{
            employeeResponselist.add(new EmployeeResponse(employee));
        });

        return employeeResponselist;

    }

    @GetMapping("employee/{empEmail}")
    public List <EmployeeResponse> getAllEmployeeInfoByEmpEmail(@PathVariable String empEmail){
        
        List<Employee> employeeList = employeeService.getEmployeeByEmpEmail(empEmail);
        List<EmployeeResponse> employeeResponselist = new ArrayList<EmployeeResponse>();

        employeeList.stream().forEach(employee ->{
            employeeResponselist.add(new EmployeeResponse(employee));
        });

        return employeeResponselist;
    }

    //Get by employee empemail without using the employeeResponse to fetch data 
    // @RequestMapping("employee2/{empEmail}")
    // public List <Employee> getAllEmployeeInfoByEmpEmail(@PathVariable String empEmail){
    //     return employeeService.getEmployeeByEmpEmail(empEmail);
    // }

   


  
}
