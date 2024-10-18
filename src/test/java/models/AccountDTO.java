package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AccountDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}