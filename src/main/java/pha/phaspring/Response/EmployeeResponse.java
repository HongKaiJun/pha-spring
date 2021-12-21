package pha.phaspring.Response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import pha.phaspring.Model.ChildrenDetail;
import pha.phaspring.Model.Employee;

public class EmployeeResponse {

    
    private int id;
    private String lanId;
    private String empName;
    private String empEmail;
    private String passportNo;
    private String passportCopy;
    private String expiryDate;
    private String maritalStatus;
    private String phoneNum;
    private String houseNum; 
    private String pdpa;
    private String fileType;
    private long size;
    
    
    private SpouseDetailResponse spouseDetail;

    

    private EmployeeAddressResponse employeeAddress;

    private EmergencyContactResponse emergencyContact;

    private List<ChildrenResponse> childDetail;

    private List<EducationDetailsResponse> educationDetailsResponse;

    
        
    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }


    public String getLanId() {
        return lanId;
    }




    public void setLanId(String lanId) {
        this.lanId = lanId;
    }




    public String getEmpName() {
        return empName;
    }




    public void setEmpName(String empName) {
        this.empName = empName;
    }




    public String getEmpEmail() {
        return empEmail;
    }




    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }




    public String getPassportNo() {
        return passportNo;
    }




    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }




    public String getPassportCopy() {
        return passportCopy;
    }




    public void setPassportCopy(String passportCopy) {
        this.passportCopy = passportCopy;
    }


    public String getExpiryDate() {
        return expiryDate;
    }




    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }




    public String getMaritalStatus() {
        return maritalStatus;
    }




    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }




    public String getPhoneNum() {
        return phoneNum;
    }




    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }




    public String getHouseNum() {
        return houseNum;
    }




    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }




    public String getPdpa() {
        return pdpa;
    }




    public void setPdpa(String pdpa) {
        this.pdpa = pdpa;
    }





    public List<ChildrenResponse> getChildDetail() {
        return childDetail;
    }




    public void setChildDetail(List<ChildrenResponse> childDetail) {
        this.childDetail = childDetail;
    }




    public List<EducationDetailsResponse> getEducationDetailsResponse() {
        return educationDetailsResponse;
    }




    public void setEducationDetailsResponse(List<EducationDetailsResponse> educationDetailsResponse) {
        this.educationDetailsResponse = educationDetailsResponse;
    }

    public EmployeeAddressResponse getEmployeeAddress() {
        return employeeAddress;
    }




    public void setEmployeeAddress(EmployeeAddressResponse employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    

    public SpouseDetailResponse getSpouseDetail() {
        return spouseDetail;
    }




    public void setSpouseDetail(SpouseDetailResponse spouseDetail) {
        this.spouseDetail = spouseDetail;
    }




    public EmergencyContactResponse getEmergencyContact() {
        return emergencyContact;
    }




    public void setEmergencyContact(EmergencyContactResponse emergencyContact) {
        this.emergencyContact = emergencyContact;
    }




    public String getFileType() {
        return fileType;
    }




    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    public long getSize() {
        return size;
    }




    public void setSize(long size) {
        this.size = size;
    }




    public EmployeeResponse(String passportCopy, String fileType, long size) {
        this.passportCopy = passportCopy;
        this.fileType = fileType;
        this.size = size;
    }




    // public List<Integer> getEmpEdu() {
    //     return empEdu;
    // }




    // public void setEmpEdu(List<Integer> empEdu) {
    //     this.empEdu = empEdu;
    // }


    // fetch data from the entities and set it in the employee response 
    public EmployeeResponse(Employee employee) {
        //Employee
        this.id= employee.getId();
        this.lanId = employee.getLanId();
        this.empName  = employee.getEmpName();
        this.empEmail=employee.getEmpEmail();
        this.passportNo=employee.getPassportNo();
        this.passportCopy=employee.getPassportCopy();
        this.expiryDate=employee.getExpiryDate();
        this.maritalStatus=employee.getMaritalStatus();
        this.phoneNum=employee.getPhoneNum();
        this.houseNum=employee.getHouseNum();
        this.pdpa=employee.getPdpa();

        //EmployeeAddress
        employeeAddress= new EmployeeAddressResponse(employee.getEmployeeAddress());
        
        //EmergencyContact
        emergencyContact = new EmergencyContactResponse(employee.getEmergencyContact());

        //SpouseDetail
        spouseDetail = new SpouseDetailResponse(employee.getSpouseDetail());


        //ChildDetail 
        childDetail = new ArrayList<ChildrenResponse>();
        for(ChildrenDetail childrenDetail : employee.getChildDetail()){
            childDetail.add(new ChildrenResponse(childrenDetail));
        }
        // //EducationDetails
        // educationDetailsResponse = new ArrayList<EducationDetailsResponse>();
        // for(EducationDetails educationDetails : employee.getEducationdetails()){
        //     educationDetailsResponse.add(new EducationDetailsResponse(educationDetails));
        // }

    }


    public EmployeeResponse() {
    }

    

}
