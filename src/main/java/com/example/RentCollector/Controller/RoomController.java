package com.example.RentCollector.Controller;

import com.example.RentCollector.Pojo.Rooms;
import com.example.RentCollector.Repository.RoomRepository;
import com.example.RentCollector.Request.CreateRoomRequest;
import com.example.RentCollector.Response.RoomResponse;
import com.example.RentCollector.Service.ServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ServiceIMPL serviceIMPL;

    @RequestMapping(value ="/Save", method = RequestMethod.POST,produces = "application/json")
    public RoomResponse createroom(@RequestBody CreateRoomRequest createRoomRequest)
    {
        return serviceIMPL.createRoom(createRoomRequest);
    }
}
