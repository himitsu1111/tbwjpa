package com.myjpa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by book on 09.12.2017.
 */
@Entity
@Table(name = "contact_tel_detail", schema = "public", catalog = "myjpa")
public class ContactTelDetail implements Serializable {
    private Long id;
    private String telType;
    private String telNumber;
    private int version;
    @ManyToOne
    @JoinColumn(name = "CONTACT_ID")
    private Contact contact;

    public ContactTelDetail() {
    }

    public ContactTelDetail(String telType, String telNumber) {
        this.telType = telType;
        this.telNumber = telNumber;
    }

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Basic
    @Column(name = "tel_type")
    public String getTelType() {
        return telType;
    }

    public void setTelType(String telType) {
        this.telType = telType;
    }



    @Basic
    @Column(name = "tel_number")
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }



    @Basic
    @Column(name = "version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }



    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactTelDetail that = (ContactTelDetail) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (telType != null ? !telType.equals(that.telType) : that.telType != null) return false;
        if (telNumber != null ? !telNumber.equals(that.telNumber) : that.telNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (telType != null ? telType.hashCode() : 0);
        result = 31 * result + (telNumber != null ? telNumber.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }

    //private Contact contactByContactId;



//    public void setContactByContactId(Contact contactByContactId) {
//        this.contactByContactId = contactByContactId;
//    }
    @Override
    public String toString() {
        return "Contact Tel Detail - Id: " + id + ", Contact id: "
                + getContact().getId() + ", Type: "
                + telType + ", Number: " + telNumber;
    }
}
