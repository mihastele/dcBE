package com.example.demo.welcomewallets;

import com.example.demo.welcomewallets.types.DWWEntry;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DWWRepository extends Repository<DWWEntry, Long> {

    DWWEntry save(DWWEntry dwwEntry);

    Optional<DWWEntry> findById(Long id);

    List<DWWEntry> findAll();

}
