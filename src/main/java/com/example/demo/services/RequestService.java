package com.example.demo.services;
import com.example.demo.model.assets;

import javax.naming.InsufficientResourcesException;

public interface RequestService {
    assets findById(int id) throws InsufficientResourcesException;

    assets save(assets assets);
}
