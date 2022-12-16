package com.mycompany.firstmicroservice.event.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class LicenseMessageEventModel {

    private String type = LicenseMessageEventModel.class.getTypeName();
    private String action;
    private String licenseId;
}
