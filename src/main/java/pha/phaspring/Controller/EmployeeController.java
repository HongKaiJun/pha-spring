package pha.phaspring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pha.phaspring.Model.Employee;
import pha.phaspring.Model.Testing;
import pha.phaspring.Repository.TestingRepository;
import pha.phaspring.Response.EmployeeResponse;
import pha.phaspring.Service.EmployeeService;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private TestingRepository testingRepository;

    

    @GetMapping("/")
    public List <EmployeeResponse> getAllEmployeesInTable(){
        
        List<Employee> employeeList = employeeService.getAllEmployees();
        List<EmployeeResponse> employeeResponselist = new ArrayList<EmployeeResponse>();

        employeeList.stream().forEach(employee ->{
            employeeResponselist.add(new EmployeeResponse(employee));
        });

        return employeeResponselist;

    }

    @GetMapping("/{empEmail}")
    public List <EmployeeResponse> getAllEmployeeInfoByEmpEmail(@PathVariable String empEmail){
        
        List<Employee> employeeList = employeeService.getEmployeeByEmpEmail(empEmail);
        List<EmployeeResponse> employeeResponselist = new ArrayList<EmployeeResponse>();

        employeeList.stream().forEach(employee ->{
            employeeResponselist.add(new EmployeeResponse(employee));
        });

        return employeeResponselist;
    }

    //Actual Update Function
    @PutMapping("/{id}")
    public Employee updateEmployeeInfoById(@PathVariable Integer id, @RequestBody Employee employeeInfo){
        return employeeService.getEmployeeById(id, employeeInfo);
    }




    //Testing !!!!!!!!!!!!!!!!!!!
    @PutMapping("/testing/{id}")
    public Testing updateTestingId(@PathVariable Integer id, @RequestBody Testing testingInfo){
        Testing testing = testingRepository.findById(id).get();

        testing.setFirstName(testingInfo.getFirstName());
        testing.setLastName(testingInfo.getLastName());
        testing.setEmailId(testingInfo.getEmailId());       
         //One to One
        testing.getEmployeeAddress().setcCity(testingInfo.getEmployeeAddress().getcCity());
        
        //One to Many
        // ChildrenDetail childrenDetails = childrenDetailRepository.findBytestingId(testingId).get(id);
        // childrenDetails.setChildName(testingInfo.getChildDetail().);
         
  
        //testing.getChildDetail().stream()
        //testing.setChildDetail(testingInfo.getChildDetail().forEach(child -> {}));
        //testing.getChildDetail().toArray();
        //testing.getChildDetail().stream().forEach(child -> {child.getChildName();});
  
         Testing updateTesting = testingRepository.save(testing);
        return  updateTesting;
    }


}
