package com.example.expensetracker;

public class App {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.addExpense("Food", 250);
        tracker.addExpense("Transport", 100);
        tracker.addExpense("Books", 350);

        System.out.println("PERSONAL EXPENSE TRACKER");
        System.out.println("------------------------");
        for (Expense expense : tracker.getExpenses()) {
            System.out.println(expense.getDescription() + ": Rs. " + expense.getAmount());
        }
        System.out.println("------------------------");
        System.out.println("Total expenses: Rs. " + tracker.getTotalExpenses());
    }
}
