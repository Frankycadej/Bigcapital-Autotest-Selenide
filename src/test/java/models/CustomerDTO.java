package models;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomerDTO {


    private AddressDTO addressBilling;
    private AddressDTO addressShipping;
    private FinancialDTO financialDTO;
    private NotesDTO notesDTO;


    private String customerType;
    private String salutation;
    private String firstName;
    private String lastName;
    private String companyName;
    private String displayName;
    private String customerEmail;
    private String personalPhoneNumber;
    private String workPhoneNumber;
    private String website;
}