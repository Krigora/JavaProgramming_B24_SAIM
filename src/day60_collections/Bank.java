package day60_collections;

public class Bank {

    double balance;

    public void withdraw(double money){

        if(money > balance){
            throw new IllegalArgumentException();
        } else if(balance < 0){
            throw new IllegalArgumentException();
        }

        System.out.println("Withdrawing $" + money);

    }

}

/*
Bank

	balance

	withdraw(double money)

		invalid cases:
		-> money > balance  -> cause exception
		-> balance < 0       -> cause exception

		valid case:
			"withdrawing " + money

	hint: throw new IllegalArguementException


 */