package Model;

/**
 * Class used to store information on individual budgets
 * such as food, gas, etc.
 */
public class Budget {
    private String name;
    private double amount;
    private double base;

    public Budget (String name) {
        this.name = name;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
