/* Basic calculator that runs addition, subtraction, multiplication, division, and modulo by Annabel Adeyeri.
Intermediate Programming Block 8.
*/
public class Calculator{
  public Calculator(){

  }
//adds
  public int add(int numberOne, int numberTwo){
    int sumOfNumbers = numberOne + numberTwo;
    return sumOfNumbers;
  }
  //subtracts
  public int subtract(int numberThree, int numberFour){
    int differenceOfNumbers = numberThree - numberFour;
    return differenceOfNumbers;
  }
  //multiplies
    public int multiply(int numberFive, int numberSix){
    int productOfNumbers = numberFive + numberSix;
    return productOfNumbers;
  }
  //divides
    public int divide(int numberSeven, int numberEight){
    int quotientOfNumbers = numberSeven + numberEight;
    return quotientOfNumbers;
  }
  //modulo operator
  public int modulo(int numberNine, int numberTen){
    int remainderOfNumbers = numberNine + numberTen;
    return remainderOfNumbers;
  }
  public static void main (String[] args){
    Calculator myCalculator = new Calculator();
    myCalculator.add(5,7);
    myCalculator.subtract(45,11);
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
  }
}
