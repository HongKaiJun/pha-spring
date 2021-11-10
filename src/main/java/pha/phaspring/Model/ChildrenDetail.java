package pha.phaspring.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="childrendetail")
public class ChildrenDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ChildID")
    private int ChildID;
    
    @Column(name = "Childname")
    private String Childname;
    @Column(name = "ChildDate")
    private Date ChildDate;
    @Column(name = "BirthCert")
    private String BirthCert;
    @Column(name = "Nationality")
    private String Nationality;
    @Column(name = "Occu")
    private String Occu;

    public ChildrenDetail() {
    }

    public ChildrenDetail(int childID, String childname, Date childDate, String birthCert, String nationality,
            String occu) {
        ChildID = childID;
        Childname = childname;
        ChildDate = childDate;
        BirthCert = birthCert;
        Nationality = nationality;
        Occu = occu;
    }

    public int getChildID() {
        return ChildID;
    }

    public void setChildID(int childID) {
        ChildID = childID;
    }

    public String getChildname() {
        return Childname;
    }

    public void setChildname(String childname) {
        Childname = childname;
    }

    public Date getChildDate() {
        return ChildDate;
    }

    public void setChildDate(Date childDate) {
        ChildDate = childDate;
    }

    public String getBirthCert() {
        return BirthCert;
    }

    public void setBirthCert(String birthCert) {
        BirthCert = birthCert;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getOccu() {
        return Occu;
    }

    public void setOccu(String occu) {
        Occu = occu;
    }
    
    
}
