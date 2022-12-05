package com.mycompany.firstmicroservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.util.Objects;

@Getter
@Setter
@Builder
public class LicenseDto extends RepresentationModel<LicenseDto> {

    private int id;

    private String licenseId;

    private String description;

    private String organizationId;

    private String productName;

    private String licenseType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LicenseDto that = (LicenseDto) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
