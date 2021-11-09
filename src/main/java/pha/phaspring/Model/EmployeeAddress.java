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

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="employeeaddress")
public class EmployeeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="AddressID")
    private int AddressID;

    @Column(name = "P_City")
    private String p_city;
    @Column(name = "P_State")
    private String p_state;
    @Column(name = "P_PostCode")
    private String p_postcode;
    @Column(name = "P_Country")
    private String p_country;
    @Column(name = "P_Address")
    private String p_address;

    @Column(name = "C_City")
    private String c_city;
    @Column(name = "C_State")
    private String c_state;
    @Column(name = "C_PostCode")
    private String c_postcode;
    @Column(name = "C_Country")
    private String c_country;
    @Column(name = "C_Address")
    private String c_address;

    //@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "employeeAddress" )
    //private Employee employee;


    public EmployeeAddress() {
    }


    public EmployeeAddress(int AddressId, String p_city, String p_state, String p_postcode, String p_country,
            String p_address, String c_city, String c_state, String c_postcode, String c_country, String c_address) {
        this.AddressID = AddressId;
        this.p_city = p_city;
        this.p_state = p_state;
        this.p_postcode = p_postcode;
        this.p_country = p_country;
        this.p_address = p_address;
        this.c_city = c_city;
        this.c_state = c_state;
        this.c_postcode = c_postcode;
        this.c_country = c_country;
        this.c_address = c_address;
    }


    public int getAddressId() {
        return AddressID;
    }


    public void setAddressId(int AddressId) {
        this.AddressID = AddressId;
    }


    public String getP_city() {
        return p_city;
    }


    public void setP_city(String p_city) {
        this.p_city = p_city;
    }


    public String getP_state() {
        return p_state;
    }


    public void setP_state(String p_state) {
        this.p_state = p_state;
    }


    public String getP_postcode() {
        return p_postcode;
    }


    public void setP_postcode(String p_postcode) {
        this.p_postcode = p_postcode;
    }


    public String getP_country() {
        return p_country;
    }


    public void setP_country(String p_country) {
        this.p_country = p_country;
    }


    public String getP_address() {
        return p_address;
    }


    public void setP_address(String p_address) {
        this.p_address = p_address;
    }


    public String getC_city() {
        return c_city;
    }


    public void setC_city(String c_city) {
        this.c_city = c_city;
    }


    public String getC_state() {
        return c_state;
    }


    public void setC_state(String c_state) {
        this.c_state = c_state;
    }


    public String getC_postcode() {
        return c_postcode;
    }


    public void setC_postcode(String c_postcode) {
        this.c_postcode = c_postcode;
    }


    public String getC_country() {
        return c_country;
    }


    public void setC_country(String c_country) {
        this.c_country = c_country;
    }


    public String getC_address() {
        return c_address;
    }


    public void setC_address(String c_address) {
        this.c_address = c_address;
    }


}
