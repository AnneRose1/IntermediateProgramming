/* This code calculates the monthly amount you should pay on your car loan. This was made by Annabel Adeyeri on Febuary 20, 2020.*/
public class CarLoan {
	public static void main(String[] args) {
  //lists car price
  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;
  // makes sure you take out valid loan
  if (loanLength <= 0){
    System.out.println("Error! You must take out a valid car loan.");
  }else if (downPayment >= carLoan ){
    System.out.println("Car paid in full.");
  }else {
    int remainingBalance = carLoan - downPayment;
    int loanLengthMonths = 12 * loanLength;
    int monthlyBalance = remainingBalance / loanLengthMonths;
    int interest = (monthlyBalance * interestRate)/100;
    int monthlyPayment = interest + monthlyBalance;
    System.out.println("You should pay $" + monthlyPayment + " a month.");
  }
	}
}
