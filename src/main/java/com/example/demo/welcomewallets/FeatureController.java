package com.example.demo.welcomewallets;

import com.example.demo.welcomewallets.types.DWWEntry;
import com.example.demo.welcomewallets.types.Store;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/feature")
public class FeatureController {

    private final FeatureService featureService;

    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @PostMapping("/initialize-dummy-stores")
    public List<Store> init() {
        Store store1 = new Store("KMS", "address11", "123123123");
        Store store2 = new Store("CDEF", "address200", "456789789");
        featureService.insertStore(store1);
        featureService.insertStore(store2);
        return featureService.getAllStores();
    }

    @GetMapping("/stores")
    public List<Store> getAllStores() {
        return featureService.getAllStores();
    }

    @PostMapping("/store")
    public Store getAllStores(@RequestBody Store store) {
        featureService.insertStore(store);
        return store;
    }

    @GetMapping("/store/{id}")
    public Store getAllStores(@PathVariable String id) {
        return featureService.getStoreById(id);
    }

    @GetMapping("/dww-entries")
    public List<DWWEntry> getDWWEntries() {
        return featureService.getAllDWWEntries();
    }

    @PostMapping("/dww-entry")
    public DWWEntry insertDWWEntry(@RequestBody DWWEntry dwwEntry) {
        BigDecimal installments = new BigDecimal(dwwEntry.getInstallmentsOfPayment());
        BigDecimal total = dwwEntry.getUpfrontFee().add(dwwEntry.getMonthlyCharge().multiply(installments));
        dwwEntry.setTotalContractCost(total);
        featureService.insertDWWEntry(dwwEntry);
        return dwwEntry;
    }

}
