package com.company;

public class HealthyBurger extends Hamburger{
    private String additionFive;
    private String additionSix;
    private double deluxeAdditionPrice;
    private double basePrice;

    public HealthyBurger(String meat) {
        super(meat, "Wheat", 0.0, "Healthy Burger");
        this.deluxeAdditionPrice = 1.85d;
    }

    public void setAdditionFive(String additionFive) {
        this.additionFive = additionFive;
    }
    public void setAdditionSix(String additionSix) {
        this.additionSix = additionSix;
    }

    @Override
    public double basePricePlusAdditions() {
        basePrice = super.basePricePlusAdditions();

        if (this.additionFive != null) {
            basePrice += deluxeAdditionPrice;
            System.out.println("5) " + additionFive + ": $" + deluxeAdditionPrice);
            if (this.additionSix != null) {
                basePrice += (deluxeAdditionPrice + deluxeAdditionPrice);
                System.out.println("6) " + additionSix + ": $" + deluxeAdditionPrice);
            }
        }
        return basePrice;
    }

}
