package pha.phaspring.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import pha.phaspring.Model.Employee;
import pha.phaspring.Model.Testing;
import pha.phaspring.Repository.ChildrenDetailRepository;
import pha.phaspring.Repository.EducationDetailsRepository;
import pha.phaspring.Repository.EmployeeAddressRepository;
import pha.phaspring.Repository.EmployeeRepository;
import pha.phaspring.Request.UpdateChildRequest;
import pha.phaspring.Response.EmployeeResponse;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeAddressRepository employeeAddressRepository;

    @Autowired
    public ChildrenDetailRepository childrenDetailRepository;

    @Autowired
    public EducationDetailsRepository educationDetailsRepository;

    //Get all employee related info
    public List <EmployeeResponse> getAllEmployees(){
        
        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeResponse> employeeResponselist = new ArrayList<EmployeeResponse>();

        employeeList.stream().forEach(employee -> {
            employeeResponselist.add(new EmployeeResponse(employee));
        });

        return employeeResponselist;
    }

    // Get all employee related info by email account
    public EmployeeResponse getEmployeeByEmpEmail(String empEmail) {

        Employee employeeList = employeeRepository.findByEmpEmail(empEmail);
        EmployeeResponse employeeResponselist = new EmployeeResponse(employeeList);

        return employeeResponselist;

    }

    // Update Function by ID 
    public Employee getEmployeeById(Integer id, @RequestBody Employee employeeInfo) {
        Employee employee = employeeRepository.findById(id).get();

        // String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        employee.setLanId(employeeInfo.getLanId());
        employee.setEmpName(employeeInfo.getEmpName());
        employee.setPassportNo(employeeInfo.getPassportNo());
        employee.setPassportCopy(employeeInfo.getPassportCopy()); //image upload 
        employee.setExpiryDate(employeeInfo.getExpiryDate());
        employee.setMaritalStatus(employeeInfo.getMaritalStatus());
        employee.setPhoneNum(employeeInfo.getPhoneNum());
        employee.setHouseNum(employeeInfo.getHouseNum());
        employee.setEmpEmail(employeeInfo.getEmpEmail());

        

        // Employee Address
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

        // EmergencyContact
        employee.getEmergencyContact().setName1(employeeInfo.getEmergencyContact().getName1());
        employee.getEmergencyContact().setRelationship1(employeeInfo.getEmergencyContact().getRelationship1());
        employee.getEmergencyContact().setContactNum1(employeeInfo.getEmergencyContact().getContactNum1());
        employee.getEmergencyContact().setName2(employeeInfo.getEmergencyContact().getName2());
        employee.getEmergencyContact().setRelationship2(employeeInfo.getEmergencyContact().getRelationship2());
        employee.getEmergencyContact().setContactNum2(employeeInfo.getEmergencyContact().getContactNum2());
        // spouseDetail
        employee.getSpouseDetail().setSpouseName(employeeInfo.getSpouseDetail().getSpouseName());
        employee.getSpouseDetail().setOccupation(employeeInfo.getSpouseDetail().getOccupation());
        employee.getSpouseDetail().setContactNum(employeeInfo.getSpouseDetail().getContactNum());
        employee.getSpouseDetail().setMarriageCert(employeeInfo.getSpouseDetail().getMarriageCert());

        Employee updateEmployee = employeeRepository.save(employee);
        return updateEmployee;
    }

    // Update Function by EmpEmail
    public Employee getEmployeeByEmployeeEmail(String empEmail, @RequestBody EmployeeResponse employeeInfo) {
        Employee employee = employeeRepository.findByempEmail(empEmail);
        //String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        employee.setLanId(employeeInfo.getLanId());
        employee.setEmpName(employeeInfo.getEmpName());
        employee.setPassportNo(employeeInfo.getPassportNo());
        employee.setPassportCopy(employeeInfo.getPassportCopy()); //image upload 
        employee.setExpiryDate(employeeInfo.getExpiryDate());
        employee.setMaritalStatus(employeeInfo.getMaritalStatus());
        employee.setPhoneNum(employeeInfo.getPhoneNum());
        employee.setHouseNum(employeeInfo.getHouseNum());
        employee.setEmpEmail(employeeInfo.getEmpEmail());

        // Employee Address
        //System.out.println(employeeInfo.getEmployeeAddress().getcCity());
        if(employeeInfo.getEmployeeAddress() != null){
            //employee.setEmployeeAddress(employeeInfo.getEmployeeAddress());
        }
        System.out.println ("before the code");
    
        
        employee.getEmployeeAddress().setpCity(employeeInfo.getEmployeeAddress().getpCity());;
        employee.getEmployeeAddress().setpState(employeeInfo.getEmployeeAddress().getpState());
        employee.getEmployeeAddress().setpPostcode(employeeInfo.getEmployeeAddress().getpPostcode());
        employee.getEmployeeAddress().setpCountry(employeeInfo.getEmployeeAddress().getpCountry());
        employee.getEmployeeAddress().setpAddress(employeeInfo.getEmployeeAddress().getpAddress());

        employee.getEmployeeAddress().setcCity(employeeInfo.getEmployeeAddress().getcCity());
        employee.getEmployeeAddress().setcState(employeeInfo.getEmployeeAddress().getcState());
        employee.getEmployeeAddress().setcPostcode(employeeInfo.getEmployeeAddress().getcPostcode());
        employee.getEmployeeAddress().setcCountry(employeeInfo.getEmployeeAddress().getcCountry());
        employee.getEmployeeAddress().setcAddress(employeeInfo.getEmployeeAddress().getcAddress());
        System.out.println ("after the code");
        // // EmergencyContact
        // employee.getEmergencyContact().setName1(employeeInfo.getEmergencyContactResponse().getName1());
        // employee.getEmergencyContact().setRelationship1(employeeInfo.getEmergencyContactResponse().getRelationship1());
        // employee.getEmergencyContact().setContactNum1(employeeInfo.getEmergencyContactResponse().getContactNum1());
        // employee.getEmergencyContact().setName2(employeeInfo.getEmergencyContactResponse().getName2());
        // employee.getEmergencyContact().setRelationship2(employeeInfo.getEmergencyContactResponse().getRelationship2());
        // employee.getEmergencyContact().setContactNum2(employeeInfo.getEmergencyContactResponse().getContactNum2());

        // // spouseDetail
        // employee.getSpouseDetail().setSpouseName(employeeInfo.getSpouseDetailResponse().getSpouseName());
        // employee.getSpouseDetail().setOccupation(employeeInfo.getSpouseDetailResponse().getOccupation());
        // employee.getSpouseDetail().setContactNum(employeeInfo.getSpouseDetailResponse().getContactNum());
        // employee.getSpouseDetail().setMarriageCert(employeeInfo.getSpouseDetailResponse().getMarriageCert());

        Employee updateEmployee = employeeRepository.save(employee);
        return updateEmployee;
    }



    public List<UpdateChildRequest> getChildDetail(Integer testingId) {
        childrenDetailRepository.findBytestingId(testingId);

        Testing testing = new Testing();
        testing.getChildDetail();

        return null;
    }

    // testing upload passport for employee
    public Employee storePassport(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            Employee empFile = new Employee(fileName, file.getContentType(), file.getBytes());

            return employeeRepository.save(empFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
