package com.Soofa;

public class Balance {
    private String balance;
    private String currency;
    private float timestamp;

    @Override
    public String toString() {
        return "Balance{" +
                "balance='" + balance + '\'' +
                ", currency='" + currency + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

// Getter Methods

    public String getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public float getTimestamp() {
        return timestamp;
    }

    // Setter Methods

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setTimestamp(float timestamp) {
        this.timestamp = timestamp;
    }
}