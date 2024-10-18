package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class FinancialDTO {

    private String currency;
    private String openingBalance;
    private Date openingBalanceAt;
}