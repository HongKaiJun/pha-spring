package pha.phaspring.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pha.phaspring.Model.ChildrenDetail;
import pha.phaspring.Model.Employee;
import pha.phaspring.Model.Testing;
import pha.phaspring.Repository.ChildrenDetailRepository;
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

    @Autowired
    private ChildrenDetailRepository childrenDetailRepository;




    // Get All Employee
    @GetMapping("/")
    public List <EmployeeResponse> getAllEmployeesInTable(){
    
        return employeeService.getAllEmployees();

    }

    //Get All Employee by Email
    @GetMapping("/{empEmail}")
    public List <EmployeeResponse> getAllEmployeeInfoByEmpEmail(@PathVariable String empEmail){
     
        return employeeService.getEmployeeByEmpEmail(empEmail);
        
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
        
        
        
        // One to Many
      
        List<ChildrenDetail> childrenDetailNew = new ArrayList<ChildrenDetail>();
        

        List<ChildrenDetail> childrenDetailOld = childrenDetailRepository.findAll();
        //Update data once get 
        for( ChildrenDetail cnew : childrenDetailNew){
            Integer childId = cnew.getChildId();
            String childName = cnew.getChildName();
            Date getChildDate = cnew.getChildDate();
            String getBirthCert = cnew.getBirthCert();
            String getNationality = cnew.getNationality();
            String getOccu = cnew.getOccu();
            

            for (ChildrenDetail cold: childrenDetailOld){
                Integer childIdOld = cold.getChildId();

                if(childId.equals(childIdOld)){
                    cold.setChildName(childName);
                    cold.setChildDate(getChildDate);
                    cold.setBirthCert(getBirthCert);
                    cold.setNationality(getNationality);
                    cold.setOccu(getOccu);
                }
                
            }
        }

 
        Testing updateTesting = testingRepository.save(testing);
        return  updateTesting;
    }

}
