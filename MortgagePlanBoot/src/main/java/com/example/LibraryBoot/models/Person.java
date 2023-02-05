package com.example.LibraryBoot.models;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name shouldn't be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Column(name = "loan")
    @NotNull
    private double loan;

    @Column(name = "interest")
    @NotNull
    private double interest;

    @Column(name = "years")
    @NotNull
    private int years;

    @Column(name = "payment")
    @NotNull
    private double payment;

    public Person() {

    }

    public Person(int id, String name, double loan, double interest, int years) {
        this.id = id;
        this.name = name;
        this.loan = loan;
        this.interest = interest;
        this.years = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getPayment() {
        return payment;
    }

    //we use this method because, according to the task, we cannot use Math()
    public String getPaymentToString() {
        String result = String.format("%.2f", payment);
        return result;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}