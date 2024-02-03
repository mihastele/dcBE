package com.example.demo.welcomewallets;

import com.example.demo.welcomewallets.types.DWWEntry;
import com.example.demo.welcomewallets.types.Store;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface StoreRepository extends Repository<Store, String> {
    Store save(Store store);
    Optional<Store> findById(String id);

    List<Store> findAll();

}
