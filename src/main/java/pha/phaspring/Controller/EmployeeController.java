package pha.phaspring.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
import pha.phaspring.Response.ChildrenResponse;
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
        
    


        //One to Many
        List<ChildrenDetail> childrenDetail = testing.getChildDetail().stream().collect(Collectors.toList());

        testing.setChildDetail(childrenDetail);
        // List <ChildrenResponse> childrenResponse = new ArrayList<ChildrenResponse>();
        // for(ChildrenDetail childrenDetail : testingInfo.getChildDetail()){
        //     childrenResponse.add(new ChildrenResponse(childrenDetail));
        // }
        
        // List<ChildrenDetail> childrenDetails = new ArrayList<>();
        
        //List<String> stringList = new ArrayList<String>();
        // List<String> getdata =testingInfo.getChildDetail().stream()
        // .map((c -> c.getChildId() + c.getChildName() + c.getBirthCert() + c.getChildDate() + c.getNationality())).collect(Collectors.toList());
        

       // List<String> getdata = new ArrayList<testingInfo>();    
        
        //List<ChildrenDetail> childrenDetails = Arrays.asList(getdata.toArray());
        // //testing.setChildDetail(getdata);

        // for (ChildrenDetail childrenDetail : getdata) {
        //     if (childrenDetail.getChildId().equals()) {
        //         user.setUsername("newvalue");
        //         break;  
        //     }
        // }

        //List<ChildrenDetail> childrenDetailUpdate = testingInfo.getChildDetail().stream().flatMap(child-> child.getChildId().stream()).collect(Collectors.toList());
        //List<ChildrenDetail> childrenDetailinDB= testing.getChildDetail();
        // List<ChildrenDetail> getchildrenDetailUpdate = testingInfo.getChildDetail();
        // getchildrenDetailUpdate.forEach(child-> { child.getChildId();});
        //Iterator<ChildrenDetail> childIterator = getchildrenDetail.iterator(); 
      
        
        // testing.setChildDetail(getchildrenDetailUpdate);
        // testing.setChildDetail(childrenDetailUpdate.addAll());
        //SET UPDATE DATA into the model
        // for (ChildrenDetail childrenDetail: testingInfo.getChildDetail()){
        //     childrenDetail.setChildName(testingInfo.getChildDetail());
        // }
        
        // List<ChildrenDetail> childrenDetail = testing.getChildDetail().stream().collect(Collectors.toList());
        // for( ChildrenDetail c : childrenDetail){
        //     c.getChildId();
        //     c.getChildName();
        //     c.getChildDate();
        //     c.getBirthCert();
            
        //     // if (c.getChildId().equals()) {
        //         //         user.setUsername("newvalue");
        //         //         break;  
        //         //     }
            

        //     System.out.println(c);
        //     System.out.println("Show me the output!!");
        // }         
        
        // List <ChildrenDetail> childrenDetailList = testing.getChildDetail();
        // List <ChildrenResponse> childrenResponseList = new ArrayList<ChildrenResponse>();
        
        // childrenDetailList.stream().forEach(children ->{
        //     childrenResponseList.add(new ChildrenResponse(children));
        // }); 
        // List <ChildrenDetail> findAllChild =  childrenDetailRepository.findAll();
        // for (ChildrenDetail c :findAllChild){
            
        // }

        // List <ChildrenDetail> childrenDetails =  new ArrayList<ChildrenDetail>();
        // for (ChildrenDetail c :childrenDetails){
        //     c.getChildName(testing.setChildDetail());
        // }

        
        //Collection<ChildrenDetail> existingchilddetail = new LinkedList<ChildrenDetail>();
        


        // List <ChildrenDetail> childrenDetail = testingInfo.getChildDetail().stream().collect(Collectors.toList());
        // testing.setChildDetail(new ArrayList<ChildrenDetail>(childrenDetail));
      
        
        // List <ChildrenDetail> childrenDetails = new ArrayList<ChildrenResponse>();
        // for(List<ChildrenDetail> childrenDetail : testingInfo.getChildDetail()){
        //     // childrenResponse.add(new ChildrenResponse(childrenDetail));

        // }

        //testing.getChildDetail().stream().forEach(child -> );;
        //testing.getChildDetail().add(testingInfo.getChildDetail().addAll());
        // ChildrenDetail childrenDetails = childrenDetailRepository.findBytestingId(testingId).get(id);
        // childrenDetails.setChildName(testingInfo.getChildDetail().);
         
        //Many to Many 
  
        //testing.getChildDetail().stream()
        //testing.setChildDetail(testingInfo.getChildDetail().forEach(child -> {}));
        //testing.getChildDetail().toArray();
        //testing.getChildDetail().stream().forEach(child -> {child.getChildName();});
  
        Testing updateTesting = testingRepository.save(testing);
        return  updateTesting;
    }


}
