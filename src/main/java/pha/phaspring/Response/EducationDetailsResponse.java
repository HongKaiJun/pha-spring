package pha.phaspring.Response;

import java.util.Date;

import pha.phaspring.Model.EducationDetails;

public class EducationDetailsResponse {
    
    private int empEdu;
    private String collegeName;
    private Date yearObtain;
    private String certificate;

    

    public EducationDetailsResponse() {
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


    public EducationDetailsResponse (EducationDetails educationDetails){
        this.empEdu = educationDetails.getEmpEdu();
        this.collegeName = educationDetails.getCollegeName();
        this.yearObtain = educationDetails.getYearObtain();
        this.certificate = educationDetails.getCertificate(); 

    }
}
