package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String bread;
    private double price;

    // Additional possible item names
    private String itemAddedOne;
    private String itemAddedTwo;
    private String itemAddedThree;
    private String itemAddedFour;

    // Additional cost for each added items
    private double itemAddedCost;

    public Hamburger(String meat, String bread, double price, String name) {
        this.meat = meat;
        this.bread = bread;
        this.price = price;
        this.name = name;
        // The additional item cost is constant
        this.itemAddedCost = 1.25d;
    }

    public void setItemAddedOne(String itemAddedOne) {
        this.itemAddedOne = itemAddedOne;
    }

    public void setItemAddedTwo(String itemAddedTwo) {
        this.itemAddedTwo = itemAddedTwo;
    }

    public void setItemAddedThree(String itemAddedThree) {
        this.itemAddedThree = itemAddedThree;
    }

    public void setItemAddedFour(String itemAddedFour) {
        this.itemAddedFour = itemAddedFour;
    }


    public double basePricePlusAdditions() {
        double basePrice = price;
        System.out.println("You ordered a " + this.name + "\n");

        System.out.println("Your additional add ons include (Unless Deluxe):\n");
        if (this.itemAddedOne != null) {
            basePrice += itemAddedCost;
            System.out.println("1) " + itemAddedOne + ": $" + this.itemAddedCost);
            if (this.itemAddedTwo != null) {
                basePrice += itemAddedCost;
                System.out.println("2) " + itemAddedTwo + ": $" + this.itemAddedCost);
                if (this.itemAddedThree != null) {
                    basePrice += itemAddedCost;
                    System.out.println("3) " + itemAddedThree + ": $" + this.itemAddedCost);
                    if (this.itemAddedFour != null) {
                        basePrice += itemAddedCost;
                        System.out.println("4) " + itemAddedFour + ": $" + this.itemAddedCost);
                    }
                }
            }
        }
        return basePrice;
    }

    public void getYourOrder() {
        System.out.println("Total = $" + basePricePlusAdditions());

    }
}
