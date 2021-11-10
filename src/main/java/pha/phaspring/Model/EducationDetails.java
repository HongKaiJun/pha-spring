package pha.phaspring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educationdetails")
public class EducationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmpEdu")
    private int EmpEdu;

    @Column(name = "CollegeName")
    private String CollegeName;

    @Column(name = "YearObtain")
    private String YearObtain;

    @Column(name = "Certificate")
    private String Certificate;

    public EducationDetails() {
    }

    public EducationDetails(int empEdu, String collegeName, String yearObtain, String certificate) {
        EmpEdu = empEdu;
        CollegeName = collegeName;
        YearObtain = yearObtain;
        Certificate = certificate;
    }

    public int getEmpEdu() {
        return EmpEdu;
    }

    public void setEmpEdu(int empEdu) {
        EmpEdu = empEdu;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    public String getYearObtain() {
        return YearObtain;
    }

    public void setYearObtain(String yearObtain) {
        YearObtain = yearObtain;
    }

    public String getCertificate() {
        return Certificate;
    }

    public void setCertificate(String certificate) {
        Certificate = certificate;
    }

}
