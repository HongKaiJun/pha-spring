package pha.phaspring.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "educationdetails")
public class EducationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empEdu;

    @Column(name = "CollegeName")
    private String collegeName;

    @Column(name = "YearObtain")
    private Date yearObtain;

    @Column(name = "Certificate")
    private String certificate;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "educationdetails" )
    private Set<Employee> employees = new HashSet<>();

    public EducationDetails() {
    }

    

    public EducationDetails(String collegeName, Date yearObtain, String certificate) {
        this.collegeName = collegeName;
        this.yearObtain = yearObtain;
        this.certificate = certificate;
    }



    public int getEmpEdu() {
        return empEdu;
    }

    public void setEmpEdu(int empEdu) {
        this.empEdu = empEdu;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Date getYearObtain() {
        return yearObtain;
    }

    public void setYearObtain(Date yearObtain) {
        this.yearObtain = yearObtain;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }



    public Set<Employee> getEmployees() {
        return employees;
    }



    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    
}
