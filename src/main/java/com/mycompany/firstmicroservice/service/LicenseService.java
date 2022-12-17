package com.mycompany.firstmicroservice.service;

import com.mycompany.firstmicroservice.model.License;
import com.mycompany.firstmicroservice.repository.LicenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.sleuth.ScopedSpan;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LicenseService {

    private final LicenseRepository licenseRepository;

    private final Tracer tracer;

    private final String SPAN_TAG_DATABASES = "MySQL:license";

    public License create(@NonNull License license) {
        ScopedSpan span = tracer.startScopedSpan("create license");
        span.tag("peer.service", SPAN_TAG_DATABASES);

        license.setId(null);
        license = licenseRepository.save(license);

        span.event("created");
        span.end();

        return license;
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
