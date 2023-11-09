package com.example.RentCollector.Response;

import com.example.RentCollector.Pojo.Rooms;

public class RoomResponse {

    private int roomno;
    private double rent;
    private long mobileno;

    private String pan;

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public RoomResponse(Rooms rooms) {
            this.roomno=rooms.getRoomno();
            this.rent=rooms.getRent();

            this.mobileno=rooms.getTenantDeatils().getMobileno();
            this.tname=rooms.getTenantDeatils().getTname();;
            this.pan=rooms.getTenantDeatils().getPan();
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

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

    private String tname;
}
