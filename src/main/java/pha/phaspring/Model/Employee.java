package pha.phaspring.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "LANID")
    private String lanId;
    @Column(name = "EmpName")
    private String empName;
    @Column(name = "PassportNo")
    private String passportNo;
    @Column(name = "PassportCopy")
    private String passportCopy;
    @Column(name = "MaritalStatus")
    private String maritalStatus;
    @Column(name = "PhoneNum")
    private String phoneNum;
    @Column(name = "HouseNum")
    private String houseNum;
    @Column(name = "EmpEmail")
    private String empEmail;
    @Column(name = "PDPA")
    private String pdpa;

    @OneToOne
    @JoinColumn(name="AddressID")
    private EmployeeAddress employeeAddress;

    @OneToOne
    @JoinColumn(name="EmergencyContact")
    private EmergencyContact emergencyContact;

    @OneToOne
    @JoinColumn(name="SpouseID")
    private SpouseDetail spouseDetail;
    
    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    private List <ChildrenDetail> childDetail;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "employee_education",
    joinColumns = {@JoinColumn(name="employee_id")},
    inverseJoinColumns = {@JoinColumn(name ="education_empEdu")})
    private Set <EducationDetails> educationdetails = new HashSet<>();

    public Employee() {
    }


    public Employee(int id, String lanId, String empName, String passportNo, String passportCopy, String maritalStatus,
            String phoneNum, String houseNum, String empEmail, String pdpa, EmployeeAddress employeeAddress,
            EmergencyContact emergencyContact, SpouseDetail spouseDetail, List<ChildrenDetail> childDetail,
            Set<EducationDetails> educationdetails) {
        this.id = id;
        this.lanId = lanId;
        this.empName = empName;
        this.passportNo = passportNo;
        this.passportCopy = passportCopy;
        this.maritalStatus = maritalStatus;
        this.phoneNum = phoneNum;
        this.houseNum = houseNum;
        this.empEmail = empEmail;
        this.pdpa = pdpa;
        this.employeeAddress = employeeAddress;
        this.emergencyContact = emergencyContact;
        this.spouseDetail = spouseDetail;
        this.childDetail = childDetail;
        this.educationdetails = educationdetails;
    }





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


    public String getEmpEmail() {
        return empEmail;
    }


    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }


    public String getPdpa() {
        return pdpa;
    }


    public void setPdpa(String pdpa) {
        this.pdpa = pdpa;
    }

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }


    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }


    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }


    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }


    public SpouseDetail getSpouseDetail() {
        return spouseDetail;
    }


    public void setSpouseDetail(SpouseDetail spouseDetail) {
        this.spouseDetail = spouseDetail;
    }


    public List<ChildrenDetail> getChildDetail() {
        return childDetail;
    }


    public void setChildDetail(List<ChildrenDetail> childDetail) {
        this.childDetail = childDetail;
    }


    public Set<EducationDetails> getEducationdetails() {
        return educationdetails;
    }


    public void setEducationdetails(Set<EducationDetails> educationdetails) {
        this.educationdetails = educationdetails;
    }

    
    
    
}
