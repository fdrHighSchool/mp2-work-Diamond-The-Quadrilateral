import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input Year:");
    int date = input.nextInt(); 
    System.out.println(isLeapYear(date));
    input.close();
  }

  public static boolean isLeapYear(int year){
    boolean tof;
    if(year%4==0){
      if(year%100 == 0){
        if(year%400 == 0){
          tof = true;
        }else{ //if%400
          tof = false;
         }
        }else{//if%100
          tof = false;
         }
      }else{ //if%4
          tof = false;
    }
    return tof;
  }// end isLeapYr
}// end main
