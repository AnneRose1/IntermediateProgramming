
/*This is Math Magic by Annabel Adeyeri on 2/5/2020.
The program manipulates numbers and prints the answer.
It always prints out 3.
Intermediate Programming Block 8*/
public class MathMagic{
  public static void main(String[] args){
    //myNumber is the original number
    int myNumber = 1;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
  }
}
