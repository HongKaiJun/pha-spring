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
@Table(name ="emergencycontact")
public class EmergencyContact {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "EmergencyContact")
    private int emergencyContact;

    @Column(name = "Name_1")
    private String name1;
    @Column(name = "Relationship_1")
    private String relationship1;
    @Column(name = "ContactNum_1")
    private String contactNum1;
    @Column(name = "Name_2")
    private String name2;
    @Column(name = "Relationship_2")
    private String relationship2;
    @Column(name = "ContactNum_2")
    private String contactNum2;

    @JsonIgnore
    @OneToOne(mappedBy = "emergencyContact")
    private Employee employee;
    
    
    public int getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(int emergencyContact) {
        this.emergencyContact = emergencyContact;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
