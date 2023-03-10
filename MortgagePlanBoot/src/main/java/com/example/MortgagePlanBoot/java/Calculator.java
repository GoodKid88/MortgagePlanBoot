package com.example.MortgagePlanBoot.java;

import com.example.MortgagePlanBoot.models.Person;
public class Calculator {
    public static double calculateMonthlyPayment(Person customer) {
        double b = customer.getInterest() / 100 / 12;
        double U = customer.getLoan();
        int PAYMENTS_PER_YEAR = 12;
        int p = customer.getYears() * PAYMENTS_PER_YEAR;

        return (U * (b * pow((1 + b), p))) / (pow((1 + b), p) - 1);
    }

    /*exponentiation method because we can't use Math()*/
    public static double pow(double value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1);
        }
    }
}
