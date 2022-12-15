package com.mycompany.firstmicroservice.event.model;

import lombok.*;

// Note Should add getter and setter
@AllArgsConstructor
@Getter
@Setter
// @NoArgsConstructor
// @ToString
public class LicenseMessageEventModel {

    private String type = LicenseMessageEventModel.class.getTypeName();
    private String action;
    private String licenseId;
}
