package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger burger = new Hamburger("Ground beef", "White", 3.45, "Simple Burger");
        burger.setItemAddedOne("cheese");
        burger.setItemAddedTwo("jalapenos");
        burger.setItemAddedThree("lettuce");
        burger.setItemAddedFour("tomatoes");

        burger.getYourOrder();

        HealthyBurger healthier = new HealthyBurger("Turkey");
        healthier.setItemAddedOne("cheese");
        healthier.setItemAddedTwo("jalapenos");
        healthier.setItemAddedThree("lettuce");
        healthier.setItemAddedFour("tomatoes");
        healthier.setAdditionFive("pickles");
        healthier.setAdditionSix("avacodo");

        healthier.getYourOrder();

        DeluxeBurger deluxe = new DeluxeBurger();

        deluxe.getYourOrder();

    }
}
