package pha.phaspring.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="spousedetail")
public class SpouseDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SpouseID")
    private int SpouseID;
    
    @Column(name = "SpouseName")
    private String SpouseName;
    @Column(name = "Occupation")
    private String Occupation;
    @Column(name = "ContactNum")
    private String ContactNum;
    @Column(name = "MarriageCert")
    private String MarriageCert;

    //@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "spouseDetail" )
    //private Employee employee;

    public SpouseDetail() {
    }

    public SpouseDetail(int spouseID, String spouseName, String occupation, String contactNum, String marriageCert) {
        SpouseID = spouseID;
        SpouseName = spouseName;
        Occupation = occupation;
        ContactNum = contactNum;
        MarriageCert = marriageCert;
    }

    public int getSpouseID() {
        return SpouseID;
    }

    public void setSpouseID(int spouseID) {
        SpouseID = spouseID;
    }

    public String getSpouseName() {
        return SpouseName;
    }

    public void setSpouseName(String spouseName) {
        SpouseName = spouseName;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getContactNum() {
        return ContactNum;
    }

    public void setContactNum(String contactNum) {
        ContactNum = contactNum;
    }

    public String getMarriageCert() {
        return MarriageCert;
    }

    public void setMarriageCert(String marriageCert) {
        MarriageCert = marriageCert;
    }
    
}