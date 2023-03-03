package Inheritance;

public class Account {
    String accountNo;
    String name;
    String address;
    String phoneNo;
    String dob;
    int balance;

    Account(){

    }
    Account(String accountNo , String name , String address , String phoneNo , String dob ,int balance){
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public String getAccountNo(){
        return accountNo;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;    
    }


    public void setAddress(String address){
        this.address = address;
    }
    public String getAdress(){
        return address;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public String getPhoneNo(){
        return phoneNo;
    }

    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return dob;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    public void closeAccount(){
        System.out.println("Account is closed");
    }

}

class SavingAccount extends Account{
    public void withdraw(){
        System.out.println("In Withdraw");
    }

    public void deposit(){
        System.out.println("In Deposit");
    }

    public void fixedDeposit(){
        System.out.println("In fixed deposit");
    }
}

class LoanAccount extends Account{
    void payEmi(){

    }

    void topUpLoan(){

    }

    void rePayment(){
        
    }
}
