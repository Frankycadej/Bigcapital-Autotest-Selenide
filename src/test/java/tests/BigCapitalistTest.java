package tests;

public class BigCapitalistTest {

//    Зарегестрироваться Account и Организацию
//      1. Зарегистрировать себя
//        1.1 Заполнить First Name
//        1.2 Заполнить Last Name
//        1.3 Заполнить Email
//        1.4 Заполнить Password
//        1.5 Continue
//       2. Зарегистрировать организцаю
//        2.1 Заполнить Organization Name
//        2.2 Выбрать Business Location
//        2.3 Выбрать Base Currency (Zloty)
//        2.4 Выбрать Language (опционально)(там нечего выбирать оказывается)
//        2.5 Выбрать Fiscal Year
//        2.6 Выбрать Time Zone
//        2.7 Continue
//       3.Дождаться Initialisation
//       4.Нажать Go to Dashboard
//       5.Проверить данные
//        5.1 Проверить General
//         5.1.1 Нажать на аватар справа сверху
//         5.1.2 Нажать на Preferences в выпадающем меню
//         5.1.3 Проверить Organization Name
//         5.1.4 Проверить Organization Tax Number
//         5.1.5 Проверить Organization Industry
//         5.1.6 Проверить Business Location
//         5.1.7 Проверить Base Currency
//         5.1.8 Проверить Fiscal Year
//         5.1.9 Проверить Language
//         5.1.10 Проверить Time Zone
//         5.1.11 Проверить Date Format
//        5.2 Проверить Users
//         5.2.1 Проверить Full Name
//         5.2.2 Проверить Email

//    Новый покупатель (Customer)
//      1.Перейти на страницу Customers (Нажать на кнопку Customers)
//      2.Перейти на страницу New Customers (Нажать на кнопку New)
//      3.Заполнить формы
//       3.1 Заполнить form__primary
//        3.1.1 Выбрать Salutation
//        3.1.2 Заполнить First Name
//        3.1.3 Заполнить Last Name
//        3.1.4 Заполнить Company Name
//        3.1.5 Выбрать Display Name
//       3.2 Заполнить form__after-primary
//        3.2.1 Заполнить Customer email
//        3.2.2 Заполнить Personal Phone number
//        3.2.3 Заполнить Work Phone Number
//        3.2.4 Заполнить Website
//       3.3 Заполнить Financial
//        3.3.1 Выбрать Currency (опционально)
//        3.3.2 Заполнить Opening Balance
//        3.3.3 Заполнить/выбрать Opening balance at (опционально)
//       3.4 Заполнить Address (Billing Address and Shipping Address)
//        3.4.1 Нажать Address
//        3.4.2 Заполнить Country
//        3.4.3 Заполнить Address line 1
//        3.4.4 Заполнить Address line 2
//        3.4.5 Заполнить City/Town
//        3.4.6 Заполнить State
//        3.4.7 Заполнить ZIP/Code
//        3.4.8 Заполнить Phone
//      4. Нажать Save
//      5. Проверить данные
//       5.1 Нажать на Customer'a
//       5.2 Проверить Customer name
//       5.3 Проверить Company name
//       5.4 Проверить Email
//       5.5 Проверить Phone number (1 and 2)
//       5.6 Проверить Website
//       5.7 Проверить Opening balance
//       5.8 Проверить Opening balance at
//       5.9 Проверить Currency code

//    Новый поставщик (Vendor)
//      1.Перейти на страницу Vendors (Нажать на Vendors in Homepage)
//      2.Перейти на страницу создания нового Vendor'a (Нажать на New Vendor)
//      3.Заполнить формы
//       3.1 Заполнить form__primary
//        3.1.1 Выбрать Salutation
//        3.1.2 Заполнить First Name
//        3.1.3 Заполнить Last Name
//        3.1.4 Заполнить Company Name
//        3.1.5 Выбрать Display Name
//       3.2 Заполнить form__after-primary
//        3.2.1 Заполнить Vendor email
//        3.2.2 Заполнить Personal Phone number
//        3.2.3 Заполнить Work Phone Number
//        3.2.4 Заполнить Website
//       3.3 Заполнить Financial
//        3.3.1 Выбрать Currency (опционально)
//        3.3.2 Заполнить Opening Balance
//        3.3.3 Заполнить/выбрать Opening balance at (опционально)
//       3.4 Заполнить Address (Billing Address and Shipping Address)
//        3.4.1 Нажать Address
//        3.4.2 Заполнить Country
//        3.4.3 Заполнить Address line 1
//        3.4.4 Заполнить Address line 2
//        3.4.5 Заполнить City/Town
//        3.4.6 Заполнить State
//        3.4.7 Заполнить ZIP/Code
//        3.4.8 Заполнить Phone
//      4. Нажать Save
//      5. Проверить данные
//       5.1 Нажать на Vendor'a
//       5.2 Проверить Vendor name
//       5.3 Проверить Company name
//       5.4 Проверить Email
//       5.5 Проверить Phone number (1 and 2)
//       5.6 Проверить Website
//       5.7 Проверить Opening balance
//       5.8 Проверить Opening balance at
//       5.9 Проверить Currency

//    Новый Products
//      1. Перейти на страницу items (нажать на products and services)
//      2. Перейти на страницу items/new (нажать на New Item)
//      3. Заполнить форму
//          3.1 Заполнить форму form__primary
//              3.1.1 Выбрать Item type
//              3.1.2 Заполнить Item Name
//              3.1.3 Заполнить Item Code
//              3.1.4 Выбрать Category            TODO сделать как утилиту
//          3.2 Заполнить форму I sell this item to a customer
//              3.2.1 Написать Selling Price
//              3.2.2 Выбрать Account
//              3.2.3 Выбрать Tax Rate
//              3.2.4 Заполнить Description
//          3.3 Заполнить форму I purchase this item from a vendor
//              3.3.1 Заполнить Cost Price (Он должен быть меньше Selling Price)
//              3.3.2 Выбрать Account
//              3.3.3 Выбрать Tax Rate
//              3.3.4 Description
//      4. Нажать Save
//      5. Проверить данные
//          5.1 Нажать на продукт
//          5.2 Сопоставить данные
//              5.2.1 Проверить Item Name
//              5.2.2 Проверить Sell Price
//              5.2.3 Проверить Cost Price
//              5.2.4 Проверить Item Type
//              5.2.5 Проверить Item code
//              5.2.6 Проверить Category Name
//              5.2.7 Проверить Sell account
//              5.2.8 Проверить Cost account
//              5.2.9 Проверить Sell Tax Rate
//              5.2.10 Проверить Purchase Tax Rate
//              5.2.11 Проверить Sell description
//              5.2.12 Проверить Purchase description

//    Новый Sales Invoices
//      1. Перейти на страницу invoices (Нажать на Sales invoices)
//      2. Перейти на страницу invoices/new (Нажать на New Invoice)
//      3. Заполнить форму
//          3.1 Заполнить форму form__header
//              3.1.1 Заполнить Customer Name
//              3.1.2 Заполнить/Выбрать Invoice date
//              3.1.3 Заполнить/Выбрать Due date
//              3.1.4 Заполнить Reference
//          3.2 Заполнить форму продукта
//              3.2.1 Выбрать продукт в Product/Service
//              3.2.2 Написать Description
//              3.2.3 Заполнить Quantity
//              3.2.4 Заполнить Rate
//              3.2.5 Заполнить Tax rate
//              3.2.6 Заполнить Discount %
//      4. Нажать Save
//      5. Проверить данные
//          5.1 Нажать на tr-context
//          5.2 Сопоставить данные
//              5.2.1 Проверить Invoice date
//              5.2.2 Проверить Due Date
//              5.2.3 Проверить Customer Name
//              5.2.4 Проверить Invoice
//              5.2.5 Проверить Due Amount
//              5.2.6 Проверить Payment amount
//              5.2.7 Проверить Reference
//              5.2.8 Проверить Created at
//              5.2.9 Проверить Product/Service
//              5.2.10 Проверить Description
//              5.2.11 Проверить Quantity
//              5.2.12 Проверить Rate
//              5.2.13 Проверить Amount
//              5.2.14 Проверить Total



//    TODO как проверять данные, вписываемые рандомом? (Хранить в переменных в тесте, брать значения из них и для заполнения, и для проверки)
}
