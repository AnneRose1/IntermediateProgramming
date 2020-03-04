/*PrimeDirective.java by Annabel Adeyeri on 2/26/2020
Finds prime numbers and stores them in an array. */
// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number){
    if (number == 2){
      return true;
    }else if (number < 2){
      return false;
    }
    for (int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      }
    }
    return true;
  }
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int number:numbers){
      if (isPrime(number) == true){
        primes.add(number);
      }
    }
    return primes;
  }
  //states if the numbers are prime or not
  public void checkPrimes(int[] moreNums){
    for (int num : moreNums){
      System.out.println("In the next few lines, it will read whether the numbers are prime or not.");
      if (isPrime(num)){
        System.out.println(num + " is a prime number.");
      }else{
        System.out.println(num + " is not a prime number.");
      }
    }
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(7));
    System.out.println(" ");
    System.out.println(pd.isPrime(28));
    System.out.println(" ");
    System.out.println(pd.isPrime(0));
    System.out.println(" ");
    pd.checkPrimes(numbers);
    System.out.println(" ");
    System.out.println(pd.onlyPrimes(numbers));
    
  }  

}
