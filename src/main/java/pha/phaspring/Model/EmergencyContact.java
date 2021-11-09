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
@Table(name ="emergencycontact")
public class EmergencyContact {
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "EmergencyContact")
    private int EmergencyContact;

    @Column(name = "Name_1")
    private String Name_1;
    @Column(name = "Relationship_1")
    private String Relationship_1;
    @Column(name = "ContactNum_1")
    private String ContactNum_1;
    @Column(name = "Name_2")
    private String Name_2;
    @Column(name = "Relationship_2")
    private String Relationship_2;
    @Column(name = "ContactNum_2")
    private String ContactNum_2;

   // @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "emergencyContact" )
    //private Employee employee;

    public EmergencyContact() {
    }

    public EmergencyContact(int emergencyContact, String name_1, String relationship_1, String contactNum_1,
            String name_2, String relationship_2, String contactNum_2) {
        EmergencyContact = emergencyContact;
        Name_1 = name_1;
        Relationship_1 = relationship_1;
        ContactNum_1 = contactNum_1;
        Name_2 = name_2;
        Relationship_2 = relationship_2;
        ContactNum_2 = contactNum_2;
    }

    public int getEmergencyContact() {
        return EmergencyContact;
    }

    public void setEmergencyContact(int emergencyContact) {
        EmergencyContact = emergencyContact;
    }

    public String getName_1() {
        return Name_1;
    }

    public void setName_1(String name_1) {
        Name_1 = name_1;
    }

    public String getRelationship_1() {
        return Relationship_1;
    }

    public void setRelationship_1(String relationship_1) {
        Relationship_1 = relationship_1;
    }

    public String getContactNum_1() {
        return ContactNum_1;
    }

    public void setContactNum_1(String contactNum_1) {
        ContactNum_1 = contactNum_1;
    }

    public String getName_2() {
        return Name_2;
    }

    public void setName_2(String name_2) {
        Name_2 = name_2;
    }

    public String getRelationship_2() {
        return Relationship_2;
    }

    public void setRelationship_2(String relationship_2) {
        Relationship_2 = relationship_2;
    }

    public String getContactNum_2() {
        return ContactNum_2;
    }

    public void setContactNum_2(String contactNum_2) {
        ContactNum_2 = contactNum_2;
    }

}
