package pha.phaspring.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="testing")
public class Testing {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;

    @OneToOne
    @JoinColumn(name="EmployeeAddress")
    private EmployeeAddress employeeAddress;

    @JsonIgnore
    @OneToMany(mappedBy="testing")
    private List <ChildrenDetail> childDetail;

    public Testing() {
    }

    

    public Testing(Integer id, String firstName, String lastName, String emailId, EmployeeAddress employeeAddress,
            List<ChildrenDetail> childDetail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.employeeAddress = employeeAddress;
        this.childDetail = childDetail;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }


    public List<ChildrenDetail> getChildDetail() {
        return childDetail;
    }



    public void setChildDetail(List<ChildrenDetail> childDetail) {
        this.childDetail = childDetail;
    }

    
    
    
}
