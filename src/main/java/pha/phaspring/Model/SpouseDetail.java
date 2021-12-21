package pha.phaspring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="spousedetail")
public class SpouseDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SpouseID")
    private int spouseId;
    
    @Column(name = "SpouseName")
    private String spouseName;
    @Column(name = "Occupation")
    private String occupation;
    @Column(name = "ContactNum")
    private String contactNum;
    @Column(name = "MarriageCert")
    private String marriageCert;

    @JsonIgnore
    @OneToOne(mappedBy = "spouseDetail")
    private Employee employee;

    public int getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(int spouseId) {
        this.spouseId = spouseId;
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

    public void setMarriageCert(String marriageCert) {
        this.marriageCert = marriageCert;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    

    
    
}