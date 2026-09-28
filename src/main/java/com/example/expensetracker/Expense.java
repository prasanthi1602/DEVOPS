package com.example.expensetracker;

public class Expense {
    private final String description;
    private final double amount;

    public Expense(String description, double amount) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() { return description; }
    public double getAmount() { return amount; }
}
