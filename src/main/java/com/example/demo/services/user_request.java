package com.example.demo.services;

import com.example.demo.model.asset_request;
import com.example.demo.model.assets;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repo.assetRequestRepo;
import org.springframework.stereotype.Service;

import javax.naming.InsufficientResourcesException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class user_request {


    @Autowired
    private assetRequestRepo assetRequestRepo;

    @Autowired
    private RequestService userRequest;

    public void createRequest(asset_request request) throws InsufficientResourcesException {
        request.setStatus("Booked");
        request.setAddtime(LocalTime.now());
        assets asset = userRequest.findById(request.getAssetId());
        if (asset.getQuantity() < request.getQuantity()) {
            throw new InsufficientResourcesException("Insufficient quantity available for asset: " + asset.getAssets_id());
        }

//        asset.setQuantity(asset.getQuantity() - request.getQuantity());
//        userRequest.save(asset);

        assetRequestRepo.save(request);

//    M2 =>    asset_request a = assetRequestRepo.findByUser_id(4);
//        a.getQuantity();
//        a.setQuantity(a.getQuantity() - 10);
//        return assetRequestRepo.save(a);
    }

    public List<Map<String, Object>> getAssets() {
        return assetRequestRepo.findByDate();
    }

    public List<asset_request> getRequests(int id){
//        List<Integer>lists =Arrays.asList(id);
        return assetRequestRepo.findByUser_id(id);
    }

    public void updateRequest(int requestId, String status){
       // asset_request ar =
        assetRequestRepo.findById(requestId).ifPresent(ar -> {
            ar.setStatus(status);
        assetRequestRepo.save(ar);
        });
        return;
    }

}
