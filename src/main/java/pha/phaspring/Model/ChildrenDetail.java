package pha.phaspring.Model;





import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="childrendetail")
public class ChildrenDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChildID")
    private int childId;


    @Column(name = "Childname")
    private String childName;
    @Column(name = "ChildDate")
    private Date childDate;
    @Column(name = "BirthCert")
    private String birthCert;
    @Column(name = "Nationality")
    private String nationality;
    @Column(name = "Occu")
    private String occu;

    @ManyToOne
    @JoinColumn(name = "EMPID")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "testingId")
    private Testing testing;

    
    
    public Testing getTesting() {
        return testing;
    }

    public void setTesting(Testing testing) {
        this.testing = testing;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Date getChildDate() {
        return childDate;
    }

    public void setChildDate(Date childDate) {
        this.childDate = childDate;
    }

    public String getBirthCert() {
        return birthCert;
    }

    public void setBirthCert(String birthCert) {
        this.birthCert = birthCert;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccu() {
        return occu;
    }

    public void setOccu(String occu) {
        this.occu = occu;
    }

   
    
    
}
