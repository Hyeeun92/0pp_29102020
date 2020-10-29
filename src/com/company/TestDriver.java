package com.company;

public class TestDriver {

    public static void run() {
        testPerson();
        testShop();
        testCar();

        testInvoice();
        testInvoiceItem();
    }

    public static void testInvoice(){
        Invoice i = new Invoice("1234");
        System.out.println("Invoice number is " + i.getNumber());
    }
    public static void testInvoiceItem(){
        InvoiceItem i = new InvoiceItem("apple");
        System.out.println("Invoice Item is " + i.getName());

        InvoiceItem i2 = new InvoiceItem("orange",300,1);
        System.out.println(i2.toString());


    }
    public static void testPerson(){
        Person p = new Person("Hyeeun");

        System.out.println("The name is " + p.getName());
        p.setAge(50);
        System.out.println("The age is " + p.getAge());
    }

    public static void testCar(){
        Car c = new Car("Volvo");
        System.out.println("The manufacturer is " + c.getManufacturer());

        Car c2 = new Car("BMW");
        System.out.println(c2.toString());
    }

    public static void testShop(){
        Shop s = new Shop("Centra");
        System.out.println("The name is " + s.getName());
    }
}
