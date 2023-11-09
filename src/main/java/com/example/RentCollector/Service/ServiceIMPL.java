package com.example.RentCollector.Service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.RentCollector.Pojo.Rooms;
import com.example.RentCollector.Pojo.TenantDeatils;
import com.example.RentCollector.Repository.RoomRepository;
import com.example.RentCollector.Repository.TennantRepository;
import com.example.RentCollector.Request.CreateRoomRequest;
import com.example.RentCollector.Response.RoomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceIMPL {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    TennantRepository tennantRepository;

    public RoomResponse createRoom(CreateRoomRequest createRoomRequest){

        TenantDeatils tenantDeatils=new TenantDeatils();

        tenantDeatils.setMobileno(createRoomRequest.getMobileno());
        tenantDeatils.setTname(createRoomRequest.getTname());
        tenantDeatils.setPan(createRoomRequest.getPan());
        System.out.println(tenantDeatils.getMobileno());

        tennantRepository.save(tenantDeatils);

        Rooms rooms=new Rooms();

        rooms.setRoomno(createRoomRequest.getRoomno());
        rooms.setRent(createRoomRequest.getRent());
        rooms.setTenantDeatils(tenantDeatils);


        roomRepository.save(rooms);

        return new RoomResponse(rooms);



    }
}
