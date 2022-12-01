import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Insert A Number:");
    int num = input.nextInt();
    for(int i = 0; i <= num; i++){
      System.out.println(fizzbuzz(i));
    }

    input.close();
  } // end main

  public static String fizzbuzz(int i){
    String divyThree = "";
    String divyFive = "";
   if (i%5 == 0){
     divyFive = "Buzz "; 
   }
  if (i%3 == 0){
    divyThree = "Fizz ";
  }
  if(divyThree.equals("")&&divyFive.equals("")){
    return(""+i);
  }else{
    return (divyThree+divyFive);
  }
  
  }//end fizzbuzz
}// end main class
