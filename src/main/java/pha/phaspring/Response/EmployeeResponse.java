package pha.phaspring.Response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import pha.phaspring.Model.ChildrenDetail;
import pha.phaspring.Model.EducationDetails;
import pha.phaspring.Model.Employee;

public class EmployeeResponse {
    @JsonProperty("ID")
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
    

    @JsonProperty("EmployeeAddress")
    private String pCity;
    private String pState;
    private String pPostcode;
    private String pCountry;
    private String pAddress;
    private String cCity;
    private String cState;
    private String cPostcode;
    private String cCountry;
    private String cAddress;
    
    @JsonProperty("EmergencyContact")
    private String name1;
    private String relationship1;
    private String contactNum1;
    private String name2;
    private String relationship2;
    private String contactNum2;

    @JsonProperty("SpouseDetail")
    private String spouseName;
    private String occupation;
    private String contactNum;
    private String marriageCert;

    private List<ChildrenResponse> childrenResponse;

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

    public String getName1() {
        return name1;
    }




    public void setName1(String name1) {
        this.name1 = name1;
    }




    public String getRelationship1() {
        return relationship1;
    }




    public void setRelationship1(String relationship1) {
        this.relationship1 = relationship1;
    }




    public String getContactNum1() {
        return contactNum1;
    }




    public void setContactNum1(String contactNum1) {
        this.contactNum1 = contactNum1;
    }




    public String getName2() {
        return name2;
    }




    public void setName2(String name2) {
        this.name2 = name2;
    }




    public String getRelationship2() {
        return relationship2;
    }




    public void setRelationship2(String relationship2) {
        this.relationship2 = relationship2;
    }




    public String getContactNum2() {
        return contactNum2;
    }




    public void setContactNum2(String contactNum2) {
        this.contactNum2 = contactNum2;
    }




    public String getSpouseName() {
        return spouseName;
    }




    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }




    public String getOccupation() {
        return occupation;
    }




    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }




    public String getContactNum() {
        return contactNum;
    }




    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }




    public String getMarriageCert() {
        return marriageCert;
    }

    




    public String getpCity() {
        return pCity;
    }




    public void setpCity(String pCity) {
        this.pCity = pCity;
    }




    public String getpState() {
        return pState;
    }




    public void setpState(String pState) {
        this.pState = pState;
    }




    public String getpPostcode() {
        return pPostcode;
    }




    public void setpPostcode(String pPostcode) {
        this.pPostcode = pPostcode;
    }




    public String getpCountry() {
        return pCountry;
    }




    public void setpCountry(String pCountry) {
        this.pCountry = pCountry;
    }




    public String getpAddress() {
        return pAddress;
    }




    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }




    public String getcCity() {
        return cCity;
    }




    public void setcCity(String cCity) {
        this.cCity = cCity;
    }




    public String getcState() {
        return cState;
    }




    public void setcState(String cState) {
        this.cState = cState;
    }




    public String getcPostcode() {
        return cPostcode;
    }




    public void setcPostcode(String cPostcode) {
        this.cPostcode = cPostcode;
    }




    public String getcCountry() {
        return cCountry;
    }




    public void setcCountry(String cCountry) {
        this.cCountry = cCountry;
    }




    public String getcAddress() {
        return cAddress;
    }




    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }




    public void setMarriageCert(String marriageCert) {
        this.marriageCert = marriageCert;
    }

    public List<ChildrenResponse> getChildrenResponse() {
        return childrenResponse;
    }




    public void setChildrenResponse(List<ChildrenResponse> childrenResponse) {
        this.childrenResponse = childrenResponse;
    }


    public List<EducationDetailsResponse> getEducationDetailsResponse() {
        return educationDetailsResponse;
    }




    public void setEducationDetailsResponse(List<EducationDetailsResponse> educationDetailsResponse) {
        this.educationDetailsResponse = educationDetailsResponse;
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
        this.pCity = employee.getEmployeeAddress().getpCity();
        this.pState =employee.getEmployeeAddress().getpState();
        this.pPostcode = employee.getEmployeeAddress().getpPostcode();
        this.pCountry = employee.getEmployeeAddress().getpCountry();
        this.pAddress=employee.getEmployeeAddress().getpAddress();
        this.cCity = employee.getEmployeeAddress().getcCity();
        this.cState =employee.getEmployeeAddress().getcState();
        this.cPostcode = employee.getEmployeeAddress().getcPostcode();
        this.cCountry = employee.getEmployeeAddress().getcCountry();
        this.cAddress=employee.getEmployeeAddress().getcAddress();
        //EmergencyContact
        this.name1 = employee.getEmergencyContact().getName1();
        this.relationship1 = employee.getEmergencyContact().getRelationship1();
        this.contactNum1 = employee.getEmergencyContact().getContactNum1();
        this.name2 = employee.getEmergencyContact().getName2();
        this.relationship2 = employee.getEmergencyContact().getRelationship2();
        this.contactNum2 = employee.getEmergencyContact().getContactNum2();
        //SpouseDetail
        this.spouseName = employee.getSpouseDetail().getSpouseName();
        this.occupation = employee.getSpouseDetail().getOccupation();
        this.contactNum = employee.getSpouseDetail().getContactNum();
        this.marriageCert = employee.getSpouseDetail().getMarriageCert();
        //ChildDetail 
        childrenResponse = new ArrayList<ChildrenResponse>();
        for(ChildrenDetail childrenDetail : employee.getChildDetail()){
            childrenResponse.add(new ChildrenResponse(childrenDetail));
        }
        //EducationDetails
        educationDetailsResponse = new ArrayList<EducationDetailsResponse>();
        for(EducationDetails educationDetails : employee.getEducationdetails()){
            educationDetailsResponse.add(new EducationDetailsResponse(educationDetails));
        }

    }

    


}
