package com.example.RentCollector.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TenantDeatils {

    @Id
    private long mobileno;

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    private String pan;
    private String tname;
}
