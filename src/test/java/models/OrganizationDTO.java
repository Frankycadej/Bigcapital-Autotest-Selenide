package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class OrganizationDTO {

    private String organizationName;
    private String businessLocation;
    private String baseCurrency;
    private String language;
    private String fiscalYear;
    private String timeZone;
}