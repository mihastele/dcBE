package com.example.demo.welcomewallets;

import com.example.demo.welcomewallets.types.DWWEntry;
import com.example.demo.welcomewallets.types.Store;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {

    private final DWWRepository dwwRepository;
    private final StoreRepository storeRepository;

    public FeatureService(DWWRepository dwwRepository, StoreRepository storeRepository) {
        this.dwwRepository = dwwRepository;
        this.storeRepository = storeRepository;
    }

    public void insertDWWEntry(DWWEntry dwwEntry) {
        dwwRepository.save(dwwEntry);
    }

    public void insertStore(Store store) {
        storeRepository.save(store);
    }

    List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    List<DWWEntry> getAllDWWEntries() {
        return dwwRepository.findAll();
    }

    public Store getStoreById(String id) {
        return storeRepository.findById(id).orElse(null);
    }
}
