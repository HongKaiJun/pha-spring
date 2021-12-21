package pha.phaspring.Response;



import java.util.Date;

import pha.phaspring.Model.ChildrenDetail;


public class ChildrenResponse {
    private int childId;
    private String childName;
    private Date childDate;
    private String birthCert;
    private String nationality;
    private String occu;

    

  
    
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
    public ChildrenResponse() {
    }

    public ChildrenResponse (ChildrenDetail childrenDetail){
        this.childId = childrenDetail.getChildId();
        this.childName = childrenDetail.getChildName();
        this.childDate = childrenDetail.getChildDate();
        this.birthCert = childrenDetail.getBirthCert();
        this.nationality = childrenDetail.getNationality();
        this.occu = childrenDetail.getOccu();
    }   

    
}
