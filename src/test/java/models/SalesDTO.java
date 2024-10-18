package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class SalesDTO {

    private String customerName;
    private Date invoiceDate;
    private Date dueDate;
    private String invoice;
    private String reference;

    private String product;
    private String description;
    private String quantity;
    private String rate;
    private String taxRate;
    private String discount;
    private String total;
}