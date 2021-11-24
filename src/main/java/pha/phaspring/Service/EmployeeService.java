package pha.phaspring.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pha.phaspring.Model.Employee;
import pha.phaspring.Model.EmployeeAddress;
import pha.phaspring.Repository.EmployeeAddressRepository;
import pha.phaspring.Repository.EmployeeRepository;
import pha.phaspring.Response.EmployeeResponse;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeAddressRepository employeeAddressRepository;


    public List <Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    

    public List<Employee> getEmployeeByEmpEmail(String empEmail){
        return employeeRepository.findByEmpEmail(empEmail);
    }


    //Update Function
    public Employee getEmployeeById(Integer id, @RequestBody Employee employeeInfo){
        Employee employee = employeeRepository.findById(id).get();
        employee.setLanId(employeeInfo.getLanId());
        employee.setEmpName(employeeInfo.getEmpName());
        employee.setPassportNo(employeeInfo.getPassportNo());
        employee.setPassportCopy(employeeInfo.getPassportCopy());
        employee.setMaritalStatus(employeeInfo.getMaritalStatus());
        employee.setPhoneNum(employeeInfo.getPhoneNum());
        employee.setHouseNum(employeeInfo.getHouseNum());
        employee.setEmpEmail(employeeInfo.getEmpEmail());
        

        //Employee Address
        employee.getEmployeeAddress().setpCity(employeeInfo.getEmployeeAddress().getpCity());
        employee.getEmployeeAddress().setpState(employeeInfo.getEmployeeAddress().getpState());
        employee.getEmployeeAddress().setpPostcode(employeeInfo.getEmployeeAddress().getpPostcode());
        employee.getEmployeeAddress().setpCountry(employeeInfo.getEmployeeAddress().getpCountry());
        employee.getEmployeeAddress().setpAddress(employeeInfo.getEmployeeAddress().getpAddress());

        employee.getEmployeeAddress().setcCity(employeeInfo.getEmployeeAddress().getcCity());
        employee.getEmployeeAddress().setcState(employeeInfo.getEmployeeAddress().getcState());
        employee.getEmployeeAddress().setcPostcode(employeeInfo.getEmployeeAddress().getcPostcode());
        employee.getEmployeeAddress().setcCountry(employeeInfo.getEmployeeAddress().getcCountry());
        employee.getEmployeeAddress().setcAddress(employeeInfo.getEmployeeAddress().getcAddress());
        
        //EmergencyContact
        employee.getEmergencyContact().setName1(employeeInfo.getEmergencyContact().getName1());
        employee.getEmergencyContact().setRelationship1(employeeInfo.getEmergencyContact().getRelationship1());
        employee.getEmergencyContact().setContactNum1(employeeInfo.getEmergencyContact().getContactNum1());
        employee.getEmergencyContact().setName2(employeeInfo.getEmergencyContact().getName2());
        employee.getEmergencyContact().setRelationship2(employeeInfo.getEmergencyContact().getRelationship2());
        employee.getEmergencyContact().setContactNum2(employeeInfo.getEmergencyContact().getContactNum2());
        //spouseDetail
        employee.getSpouseDetail().setSpouseName(employeeInfo.getSpouseDetail().getSpouseName());
        employee.getSpouseDetail().setOccupation(employeeInfo.getSpouseDetail().getOccupation());
        employee.getSpouseDetail().setContactNum(employeeInfo.getSpouseDetail().getContactNum());
        employee.getSpouseDetail().setMarriageCert(employeeInfo.getSpouseDetail().getMarriageCert());
        
    

        Employee updateEmployee = employeeRepository.save(employee);
        return updateEmployee;
    }
  

    
}
