package com.company;

public class DeluxeBurger extends Hamburger{
    private String drinkAddition;
    private String chipsAddition;
    private double deluxePrice;
    private double deluxeBasePrice;

    public DeluxeBurger() {
        super("Ground beef", "White", 8.25d, "Deluxe Burger");
        this.deluxePrice = 2.00d;
    }

    public void setDrinkAddition(String drinkAddition) {
        this.drinkAddition = "Dr Pepper";
    }

    public void setChipsAddition(String chipsAddition) {
        this.chipsAddition = "salted chips";
    }

    // To prevent any additional items being added at run object creation;
    @Override
    public void setItemAddedOne(String itemAddedOne) {
        System.out.println("No additional items can be added.");
    }

    @Override
    public double basePricePlusAdditions() {
        deluxeBasePrice = super.basePricePlusAdditions();
        deluxeBasePrice += (deluxePrice * 2);
        return deluxeBasePrice;
    }

}
