package in.knowledgegate;

public class BankAccount {
private  String accountnumber;
private String accountholdername;
private double balance;

public BankAccount(String accountnumber ,String accountholder){
    this.accountholdername = accountholdername;
    this.accountnumber = accountnumber;

}


public  void  deopsitmoney(double money){
    if(money <= 0){
        System.out.println("invalid Deposit");
    }else{
        balance += money;
    }
    
}
public double  withdrawMoney(double money){
    if (money <= 0){
        System.out.println("Invalid withdraw");
    }  else if (balance >= money){
        balance -= money;
    }
    else {
        money = balance;
        balance = 0;
    }
  
    return  money ;
}

}
