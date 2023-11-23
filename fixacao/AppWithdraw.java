package excecoes.fixacao;

import java.util.Scanner;

public class AppWithdraw {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Account account = new Account();
            System.out.println("Enter account Data");
            System.out.print("Enter number:");
            account.setNumber(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter holder: ");
            account.setHolder(sc.nextLine());
            System.out.print("Enter initial balance: ");
            account.setBalance(sc.nextDouble());
            System.out.print("Withdraw Limit: ");
            account.setWithdrawLimit(sc.nextDouble());
            System.out.println();
            System.out.print("Enter withdraw value: ");
            account.withdraw(sc.nextDouble());
            sc.close();
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
