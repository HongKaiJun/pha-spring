package pha.phaspring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "EmployeeID")
    private String employeeId;
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


    @Column(name = "ChildID")
    private int childId;
    
    @OneToOne
    @JoinColumn(name="AddressID")
    private EmployeeAddress employeeAddress;

    @OneToOne
    @JoinColumn(name="EmergencyContact")
    private EmergencyContact emergencyContact;

    @OneToOne
    @JoinColumn(name="SpouseID")
    private SpouseDetail spouseDetail;
    

    public Employee() {
    }


    public Employee(int id, String employeeId, String empName, String passportNo, String passportCopy,
            String maritalStatus, String phoneNum, String houseNum, String empEmail, String pdpa, int childId,
            EmployeeAddress employeeAddress, EmergencyContact emergencyContact,SpouseDetail spouseDetail) {
        this.id = id;
        this.employeeId = employeeId;
        this.empName = empName;
        this.passportNo = passportNo;
        this.passportCopy = passportCopy;
        this.maritalStatus = maritalStatus;
        this.phoneNum = phoneNum;
        this.houseNum = houseNum;
        this.empEmail = empEmail;
        this.pdpa = pdpa;
        this.childId = childId;
        this.employeeAddress = employeeAddress;
        this.emergencyContact = emergencyContact;
        this.spouseDetail = spouseDetail;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getEmployeeId() {
        return employeeId;
    }


    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public int getChildId() {
        return childId;
    }


    public void setChildId(int childId) {
        this.childId = childId;
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
    
}
