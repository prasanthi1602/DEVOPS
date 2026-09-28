package com.example.expensetracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExpenseTrackerTest {
    @Test
    void shouldCalculateTotalExpenses() {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.addExpense("Food", 250);
        tracker.addExpense("Transport", 100);
        tracker.addExpense("Books", 350);
        assertEquals(700.0, tracker.getTotalExpenses(), 0.001);
    }

    @Test
    void shouldReturnZeroWhenThereAreNoExpenses() {
        ExpenseTracker tracker = new ExpenseTracker();
        assertEquals(0.0, tracker.getTotalExpenses(), 0.001);
    }

    @Test
    void shouldRejectNegativeExpense() {
        ExpenseTracker tracker = new ExpenseTracker();
        assertThrows(IllegalArgumentException.class,
                () -> tracker.addExpense("Food", -100));
    }

    @Test
    void shouldRejectEmptyDescription() {
        ExpenseTracker tracker = new ExpenseTracker();
        assertThrows(IllegalArgumentException.class,
                () -> tracker.addExpense("", 100));
    }
}
