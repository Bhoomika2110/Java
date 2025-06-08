package in.knowledgegate;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "prasant jain");
        account.deopsitmoney(100);
        System.out.println(account.withdrawMoney(200));
        account.deopsitmoney(-40);
        account.withdrawMoney(0);

        
    }

}
