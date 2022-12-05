package com.mycompany.firstmicroservice.controller;

import com.mycompany.firstmicroservice.dto.LicenseDto;
import com.mycompany.firstmicroservice.mapper.LicenseMapper;
import com.mycompany.firstmicroservice.model.License;
import com.mycompany.firstmicroservice.service.LicenseService;
import lombok.RequiredArgsConstructor;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/license/")
@RequiredArgsConstructor
public class LicenseController {

    private final LicenseService licenseService;

    @GetMapping("/{id}")
    public LicenseDto getLicenceById(@PathVariable Long id) {
        return LicenseMapper.INSTANCES.licenseToLicenseDto(licenseService.findById(id))
                .add(linkTo(methodOn(LicenseController.class).getLicenceById(id)).withSelfRel());
    }

    @PostMapping
    public LicenseDto createLicence(@RequestBody LicenseDto licenseDto) {

        License license = licenseService.create(LicenseMapper.INSTANCES.licenseDtoToLicense(licenseDto));

        return LicenseMapper.INSTANCES.licenseToLicenseDto(license);
    }


}
