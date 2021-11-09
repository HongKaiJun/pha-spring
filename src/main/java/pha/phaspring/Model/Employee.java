package pha.phaspring.Model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;






@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Id;
    
    @Column(name = "EmployeeID")
    private String EmployeeId;
    @Column(name = "EmpName")
    private String EmpName;
    @Column(name = "PassportNo")
    private String PassportNo;
    @Column(name = "PassportCopy")
    private String PassportCopy;
    @Column(name = "MaritalStatus")
    private String MaritalStatus;
    @Column(name = "PhoneNum")
    private int PhoneNum;
    @Column(name = "HouseNum")
    private int HouseNum;
    @Column(name = "EmpEmail")
    private String EmpEmail;
    @Column(name = "AddressID")
    private int AddressId;
    @Column(name = "EmergencyContact")
    private int EmergencyContact;
    @Column(name = "SpouseID")
    private int SpouseId;
    @Column(name = "ChildID")
    private int ChildId;
    @Column(name = "PDPA")
    private String PDPA;

  /*  @OneToOne(fetch =FetchType.EAGER, cascade =  CascadeType.ALL)
    @JoinColumn(name ="AddressID",insertable = false, updatable = false)
    private EmployeeAddress employeeAddress;

 
    @OneToOne(fetch =FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name ="EmergencyContact",insertable = false, updatable = false)
    private EmergencyContact emergencyContact;

    @OneToOne(fetch =FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name ="SpouseID",insertable = false, updatable = false)
    private SpouseDetail spouseDetail;*/


    public Employee() {
    }


    public Employee(int id, String employeeId, String empName, String passportNo, String passportCopy,
            String maritalStatus, int phoneNum, int houseNum, String empEmail, int addressId, int emergencyContact,
            int spouseId, int childId, String pDPA) {
        Id = id;
        EmployeeId = employeeId;
        EmpName = empName;
        PassportNo = passportNo;
        PassportCopy = passportCopy;
        MaritalStatus = maritalStatus;
        PhoneNum = phoneNum;
        HouseNum = houseNum;
        EmpEmail = empEmail;
        AddressId = addressId;
        EmergencyContact = emergencyContact;
        SpouseId = spouseId;
        ChildId = childId;
        PDPA = pDPA;
    }


    public int getId() {
        return Id;
    }


    public void setId(int id) {
        Id = id;
    }


    public String getEmployeeId() {
        return EmployeeId;
    }


    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }


    public String getEmpName() {
        return EmpName;
    }


    public void setEmpName(String empName) {
        EmpName = empName;
    }


    public String getPassportNo() {
        return PassportNo;
    }


    public void setPassportNo(String passportNo) {
        PassportNo = passportNo;
    }


    public String getPassportCopy() {
        return PassportCopy;
    }


    public void setPassportCopy(String passportCopy) {
        PassportCopy = passportCopy;
    }


    public String getMaritalStatus() {
        return MaritalStatus;
    }


    public void setMaritalStatus(String maritalStatus) {
        MaritalStatus = maritalStatus;
    }


    public int getPhoneNum() {
        return PhoneNum;
    }


    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }


    public int getHouseNum() {
        return HouseNum;
    }


    public void setHouseNum(int houseNum) {
        HouseNum = houseNum;
    }


    public String getEmpEmail() {
        return EmpEmail;
    }


    public void setEmpEmail(String empEmail) {
        EmpEmail = empEmail;
    }


    public int getAddressId() {
        return AddressId;
    }


    public void setAddressId(int addressId) {
        AddressId = addressId;
    }


    public int getEmergencyContact() {
        return EmergencyContact;
    }


    public void setEmergencyContact(int emergencyContact) {
        EmergencyContact = emergencyContact;
    }


    public int getSpouseId() {
        return SpouseId;
    }


    public void setSpouseId(int spouseId) {
        SpouseId = spouseId;
    }


    public int getChildId() {
        return ChildId;
    }


    public void setChildId(int childId) {
        ChildId = childId;
    }


    public String getPDPA() {
        return PDPA;
    }


    public void setPDPA(String pDPA) {
        PDPA = pDPA;
    }


    


}
