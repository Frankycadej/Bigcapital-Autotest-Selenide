package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@RequiredArgsConstructor
@Accessors(fluent = true)
public class AddressDTO {

    private String country;
    private String addressLine1;
    private String addressLine2;
    private String cityOrTown;
    private String state;
    private String zipOrCode;
    private String phone;
}