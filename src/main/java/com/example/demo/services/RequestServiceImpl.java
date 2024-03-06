package com.example.demo.services;


import com.example.demo.model.assets;
import com.example.demo.repo.assetsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.naming.InsufficientResourcesException;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    private assetsRepo assetRepo;

    @Override
    public assets save(assets asset){
        return assetRepo.save(asset);
    }

    @Override
    public assets findById(int id) throws InsufficientResourcesException {
        return assetRepo.findById(id).orElseThrow(() -> new InsufficientResourcesException("Asset not found with id: " + id));
    }
}
