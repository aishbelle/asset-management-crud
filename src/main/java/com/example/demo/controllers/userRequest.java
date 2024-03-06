package com.example.demo.controllers;

import com.example.demo.model.asset_request;
import com.example.demo.model.assets;
import com.example.demo.services.user_request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.InsufficientResourcesException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/request")
@CrossOrigin(value = "*")
public class userRequest {

    @Autowired
    private user_request userRequest;

//    public userRequest(RequestService requestService){
//        this.requestService = requestService;
//    }

    @PostMapping(path="/create")
    public ResponseEntity<Object> createRequest(@RequestBody asset_request request) {
        try{
            userRequest.createRequest(request);
            return ResponseEntity.ok(Map.of("msg", "Request Applied"));
        } catch (Exception e){
            return ResponseEntity.internalServerError().body(Map.of("msg", e.getMessage()));
        }
    }

    @GetMapping(path = "/getAssets")
    public ResponseEntity<Object> getAssets(){
        List<Map<String, Object>> assetsList = userRequest.getAssets();
        return ResponseEntity.ok(assetsList);
    }

    @GetMapping(path = "/myRequests")
    public ResponseEntity<Object> getRequests(@RequestParam int userId){
        List<asset_request> requestList = userRequest.getRequests(userId);
        return ResponseEntity.ok(requestList);
    }

    @PostMapping(path="/updateRequest")
    public ResponseEntity<Object> updateRequest(@RequestBody Map<String,Object> req){
        int requestId = (int) req.get("requestId");
        String status = (String)req.get("status");
        userRequest.updateRequest(requestId,status);
        return ResponseEntity.ok(Map.of("msg", "Request status has been updated!"));
    }

//    @GetMapping("get-request")
//    public ResponseEntity<List<asset_request>> getAllRequest(@RequestParam int userId, @RequestParam int assetId){
//
//    }
}
