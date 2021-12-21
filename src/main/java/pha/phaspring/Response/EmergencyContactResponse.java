package pha.phaspring.Response;

import pha.phaspring.Model.EmergencyContact;

public class EmergencyContactResponse {

    private int emergencyContact;
    private String name1;
    private String relationship1;
    private String contactNum1;
    private String name2;
    private String relationship2;
    private String contactNum2;


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

    public EmergencyContactResponse() {
    }

    public EmergencyContactResponse(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact.getEmergencyContact();
        this.name1 = emergencyContact.getName1();
        this.relationship1 = emergencyContact.getRelationship1();
        this.contactNum1 = emergencyContact.getContactNum1();
        this.name2 = emergencyContact.getName2();
        this.relationship2 = emergencyContact.getRelationship2();
        this.contactNum2 = emergencyContact.getContactNum2();
    }

    
    


}
