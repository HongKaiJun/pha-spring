package pha.phaspring.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import pha.phaspring.Response.ChildrenResponse;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "LANID")
    private String lanId;
    @Column(name = "EmpName")
    private String empName;
    @Column(name = "PassportNo")
    private String passportNo;
    @Column(name = "PassportCopy")
    private String passportCopy;
    @Column(name = "ExpiryDate")
    private String expiryDate;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AddressID")
    private EmployeeAddress employeeAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EmergencyContact")
    private EmergencyContact emergencyContact;

    //@JsonProperty(access = Access.WRITE_ONLY)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SpouseID", referencedColumnName = "SpouseID")
    private SpouseDetail spouseDetail;

    
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<ChildrenDetail> childDetail;

    // //@JsonIgnore
    // @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinTable(name = "employee_education", joinColumns = { @JoinColumn(name = "employee_id") }, inverseJoinColumns = {
    //         @JoinColumn(name = "education_empEdu") })
    // private Set<EducationDetails> educationdetails = new HashSet<>();

    @Column(name = "fileType")
    private String fileType;

    @Lob
    private byte[] data;

    public Employee() {
    }

    public Employee(String passportCopy,String fileType, byte[] data) {
        this.passportCopy=passportCopy;
        this.fileType = fileType;
        this.data = data;
    }

    public Employee(int id, String lanId, String empName, String passportNo, String passportCopy, String expiryDate,
            String maritalStatus, String phoneNum, String houseNum, String empEmail, String pdpa, SpouseDetail spouseDetail,
            EmployeeAddress employeeAddress, EmergencyContact emergencyContact,List<ChildrenDetail> childDetail,
             String fileType, byte[] data) {
        this.id = id;
        this.lanId = lanId;
        this.empName = empName;
        this.passportNo = passportNo;
        this.passportCopy = passportCopy;
        this.expiryDate = expiryDate;
        this.maritalStatus = maritalStatus;
        this.phoneNum = phoneNum;
        this.houseNum = houseNum;
        this.empEmail = empEmail;
        this.pdpa = pdpa;
        this.employeeAddress = employeeAddress;
        this.emergencyContact = emergencyContact;
        this.spouseDetail = spouseDetail;
        this.childDetail = childDetail;
        // this.educationdetails = educationdetails;
        this.fileType = fileType;
        this.data = data;
    }

    

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
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

  

    // public Set<EducationDetails> getEducationdetails() {
    //     return educationdetails;
    // }

    // public void setEducationdetails(Set<EducationDetails> educationdetails) {
    //     this.educationdetails = educationdetails;
    // }

}
