
    class Account{
        protected double balance;
        public Account(){
            this.balance = 0;
        }
        public Account(double balance){
            this.balance = balance;
        }
        public void withdraw(double amount){};
        public void deposit(double amount){};
        public void printBalance(){};
    }

    class Savings extends Account{
        private double interestRate = 0.8;
        public Savings(double balance){
            super(balance);
        }
        public void withdraw(double amount){
            balance -= amount + (amount * interestRate);
        }

        public void deposit(double amount){
            balance += (amount + (amount * interestRate));
        }

        public void printBalance(){
            System.out.println("Balance in your savings account is : "+ balance);
        }

    }

    class Current extends Account{
        public Current(double balance){
            super(balance);
        }
        public void withdraw(double amount){
            balance = balance - amount ;
        }

        public void deposit(double amount){
            balance = balance + amount ;
        }

        public void printBalance(){
            System.out.println("Balance in your current account is : "+balance);
        }
    }



class Demo{
    public static void main(String[] args){
        Account s = new Savings(50000);
        s.deposit(1000);
        s.printBalance();

        s.withdraw(3000);
        s.printBalance();

        Account c = new Current(50000);
        c.deposit(1000);
        c.printBalance();
        c.withdraw(3000);
        c.printBalance();
    }
}