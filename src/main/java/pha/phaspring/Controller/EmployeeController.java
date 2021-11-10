package pha.phaspring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pha.phaspring.Model.ChildrenDetail;
import pha.phaspring.Model.EmergencyContact;
import pha.phaspring.Model.Employee;
import pha.phaspring.Model.EmployeeAddress;
import pha.phaspring.Model.SpouseDetail;
import pha.phaspring.Repository.ChildrenDetailRepository;
import pha.phaspring.Repository.EmergencyContactRepository;
import pha.phaspring.Repository.EmployeeAddressRepository;
import pha.phaspring.Repository.SpouseDetailRepository;
import pha.phaspring.Service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private EmergencyContactRepository emergencyContactRepository;

    @Autowired
    private EmployeeAddressRepository employeeAddressRepository;

    @Autowired
    private SpouseDetailRepository spouseDetailRepository;

    @Autowired
    private ChildrenDetailRepository childrenDetailRepository;
    

    @GetMapping("employee")
    public List <Employee> getAllEmployeesInTable(){
        return employeeService.getAllEmployees();

    }

    @GetMapping("employeeaddress")
    public List<EmployeeAddress> getAllEmployeeAddress(){
        return employeeAddressRepository.findAll();

    }

    @GetMapping("emergencycontact")
    public List<EmergencyContact> getAllEmergencyContact(){
        return emergencyContactRepository.findAll();

    }

    @GetMapping("spousedetail")
    public List<SpouseDetail> getAllSpouseDetail(){
        return spouseDetailRepository.findAll();

    }

    @GetMapping("childrendetail")
    public List<ChildrenDetail> getAllChildrenDetail(){
        return childrenDetailRepository.findAll();

    }

    // Get all employee row based on the Id without query annotation
    @GetMapping("/employee/{Id}")
    public ResponseEntity <Employee> getEmployeeIdInTable (@PathVariable Integer Id){

       return employeeService.getEmployeeId(Id);
    }

    // Get all employee row based on the Id with query annotation
    @GetMapping("/employee2/{Id}")
    public List <Employee> getEmployee(@PathVariable Integer Id){
        return employeeService.getByEmployeeID(Id);
    }

    @GetMapping("employee3")
    public List <Employee> getAllSpouseDetailWithEmployee(){
        return employeeService.getAllSpouseDetail();

    }



  
}
