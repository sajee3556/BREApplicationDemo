package model;

/**
 * @author 212607214
 * @Date 1/26/2019
 */
public class Account {
    private Integer balance;

    public Account() {}
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    public Account(Integer balance) {
        super();
        this.balance = balance;
    }
    public void withdraw(int money) {
        balance -= money;
    }
}
