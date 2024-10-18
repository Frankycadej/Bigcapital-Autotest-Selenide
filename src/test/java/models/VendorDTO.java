package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class VendorDTO {


    private AddressDTO addressBilling;
    private AddressDTO addressShipping;
    private FinancialDTO financialDTO;
    private NotesDTO notesDTO;


    private String salutation;
    private String firstName;
    private String lastName;
    private String companyName;
    private String displayName;
    private String email;
    private String workPhoneNumber;
    private String mobilePhoneNumber;
    private String website;
}