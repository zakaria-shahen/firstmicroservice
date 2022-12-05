package com.mycompany.firstmicroservice.service;

import com.mycompany.firstmicroservice.model.License;
import com.mycompany.firstmicroservice.repository.LicenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LicenseService {

    private final LicenseRepository licenseRepository;

    public License create(@NonNull License license) {
        license.setId(null);
        return licenseRepository.save(license);
    }

    public License update(@NonNull License license) {
        license.setId(null);
        return licenseRepository.save(license);
    }

    public void delete(@NonNull Long id) {
        licenseRepository.deleteById(id);
    }

    public License findById(Long id) {
        return licenseRepository.findById(id).get();

    }
}
