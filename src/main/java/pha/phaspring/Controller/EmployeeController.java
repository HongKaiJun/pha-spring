package pha.phaspring.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.MAX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import pha.phaspring.Model.ChildrenDetail;
import pha.phaspring.Model.Employee;
import pha.phaspring.Model.Testing;
import pha.phaspring.Repository.TestingRepository;
import pha.phaspring.Response.EmployeeResponse;
import pha.phaspring.Service.EmployeeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private TestingRepository testingRepository;

    // Get All Employee
    @GetMapping("/")
    public List<EmployeeResponse> getAllEmployeesInTable() {

        return employeeService.getAllEmployees();

    }

    // Get All Employee by Email
    @GetMapping("/{empEmail}")
    public EmployeeResponse getAllEmployeeInfoByEmpEmail(@PathVariable String empEmail) {

        return employeeService.getEmployeeByEmpEmail(empEmail);
        
    }

    // Actual Update Function by ID 
    @PutMapping("id/{id}")
    public Employee updateEmployeeInfoById(@PathVariable Integer id, @RequestBody Employee employeeInfo,
            MultipartFile file) {

        return employeeService.getEmployeeById(id, employeeInfo);

    }

      // Actual Update Function by EmpEmail
      @PutMapping("/{empEmail}")
      public Employee updateEmployeeInfoByEmpEmail(@PathVariable String empEmail, @RequestBody EmployeeResponse employeeInfo,
              MultipartFile file) {
          return employeeService.getEmployeeByEmployeeEmail(empEmail, employeeInfo);
  
      }








    //testing for employee upload passport need to use post instead put
    @PostMapping("/post")
    public EmployeeResponse uploadPassport(@RequestParam("file") MultipartFile file) {
        Employee employee = employeeService.storePassport(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile")
                .path(employee.getPassportCopy()).toUriString();

        return new EmployeeResponse(employee.getPassportCopy(), file.getContentType(), file.getSize());
        // return null;
    }

    // Testing !!!!!!!!!!!!!!!!!!!
    @PutMapping("/testing/{id}")
    public Testing updateTestingId(@PathVariable Integer id, @RequestBody Testing testingInfo) {
        Testing testing = testingRepository.findById(id).get();

        testing.setFirstName(testingInfo.getFirstName());
        testing.setLastName(testingInfo.getLastName());
        testing.setEmailId(testingInfo.getEmailId());
        // One to One
        testing.getEmployeeAddress().setcCity(testingInfo.getEmployeeAddress().getcCity());
        
        // One to Many
        // Retrieving data

        // Need help or advice on this two line (check if empty or not)
        //have a null pointer checking

        // List<String> getchild = testingInfo.getChildDetail().stream().map(child-> 
        // child.getChildId()  + child.getChildName() + child.getChildDate() 
        // + child.getBirthCert() + child.getNationality() + child.getOccu()
        // + child.getEmployee() + child.getTesting()).collect(Collectors.toList());
        //List<ChildrenDetail> childrenDetailNew = Arrays.asList(getchild.toArray());
        System.out.println("abcd");

        //null checking before execute it 
        if(testingInfo.getChildDetail() != null){
            testing.setChildDetail(testingInfo.getChildDetail());
        }


        //List<ChildrenDetail> childrenDetailNew = testingInfo.getChildDetail().stream().collect(Collectors.toList());
        
        // List<ChildrenDetail> childrenDetailNew = testingInfo.getChildDetail().stream().collect(Collectors.toList());

        

        // //List<String> childrentesting = new ArrayList<String>();
        // //do compare pre-update with after update when the user click submit.
        // List<ChildrenDetail> childrenDetailOld = new ArrayList<ChildrenDetail>();

        // // Update data once get
        // for (ChildrenDetail cnew :childrenDetailNew) {
        //     Integer childId = cnew.getChildId();
        //     String childName = cnew.getChildName();
        //     Date getChildDate = cnew.getChildDate();
        //     String getBirthCert = cnew.getBirthCert();
        //     String getNationality = cnew.getNationality();
        //     String getOccu = cnew.getOccu();
        //     //Integer testingId = cnew.getTesting().getId();

        //     for (ChildrenDetail cold : childrenDetailOld) {
        //         Integer childIdOld = cold.getChildId();
        //         //left need to be constant , right need to be arrival
        //         if (childIdOld.equals(childId)) {
        //             cold.setChildName(childName);
        //             cold.setChildDate(getChildDate);
        //             cold.setBirthCert(getBirthCert);
        //             cold.setNationality(getNationality);
        //             cold.setOccu(getOccu);
                    
        //         }
                

        //     }

            

        // }
        //testing.setChildDetail();
        //Testing updateTesting = testingRepository.save(testing);
        //return updateTesting;
        return testingInfo;
    }

}
