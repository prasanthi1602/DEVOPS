package com.example.expensetracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpenseTracker {
    private final List<Expense> expenses = new ArrayList<>();

    public void addExpense(String description, double amount) {
        expenses.add(new Expense(description, amount));
    }

    public List<Expense> getExpenses() {
        return Collections.unmodifiableList(expenses);
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) total += expense.getAmount();
        return total;
    }
}
