package excecoes.fixacao;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) throws AccountException {
        if (balance - value <= 0) {
            throw new AccountException("Withdraw Error: Actual balance is not enough!!!");
        }
        if (value > withdrawLimit) {
            throw new AccountException("Withdraw Error: The amount exceeds Withdraw the limit, wich is "
                    + String.format("%.2f", withdrawLimit));
        }
        balance += value;
        System.out.println("New Balance: "+String.format("%.2f", balance));
    }

}
