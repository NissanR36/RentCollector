package com.example.RentCollector.Pojo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Rooms {
    @Id
    private int roomno;

    @OneToOne(cascade = CascadeType.ALL)
    private TenantDeatils tenantDeatils;

    public TenantDeatils getTenantDeatils() {
        return tenantDeatils;
    }

    public void setTenantDeatils(TenantDeatils tenantDeatils) {
        this.tenantDeatils = tenantDeatils;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    private double rent;

}
