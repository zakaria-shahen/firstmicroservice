package com.mycompany.firstmicroservice.mapper;

import com.mycompany.firstmicroservice.dto.LicenseDto;
import com.mycompany.firstmicroservice.model.License;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LicenseMapper {

    LicenseMapper INSTANCES = Mappers.getMapper(LicenseMapper.class);

    LicenseDto licenseToLicenseDto(License license);

    License licenseDtoToLicense(LicenseDto licenseDto);
}
