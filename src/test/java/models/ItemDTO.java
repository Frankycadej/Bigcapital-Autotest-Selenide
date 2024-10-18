package models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ItemDTO {

    private Boolean itemType;
    private String itemName;
    private String itemCode;
    private String category;
    private String sellingPrice;
    private String costPrice;
    private String accountSell;
    private String accountPurchase;
    private String taxRateSell;
    private String taxRatePurchase;
    private String descriptionSell;
    private String descriptionPurchase;
    private String inventoryAccount;
}