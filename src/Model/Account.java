package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grizz on 5/5/2017.
 */
public class Account {
    private double income;
    private List<Budget> budgets;
    private double expenses;

    public Account() {
        budgets = new ArrayList<>();
        budgets.add(new Budget("Unallocated Funds"));
    }

    public boolean addBudget(Budget newBudget) {
        if (newBudget == null) {
            return false;
        }
        budgets.add(newBudget);
        return true;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void calculateExpenses() {
        double calc = 0.0;
        for(Budget b : budgets) {
            calc += b.getBase();
        }
        expenses = calc;
    }
}
