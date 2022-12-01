class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(59));
  }// end main method
  public static String letterGrade(int grade){
    String letGrade= "";
    String modi = "";
    if (grade%10>=7 && grade > 60 || grade >= 100 ){ // f is f
      modi = "+";
    }else if (grade%10 <=2 && grade >=60){ 
      modi = "-";
    }
    if( grade >= 90){
      letGrade = "A";
    }
    if(grade >= 80 && grade<90){
     letGrade = "B";
    }
    if(grade >= 70 && grade<80){
      letGrade = "C";
    }
    if(grade>=60 && grade<70){
      letGrade = "D";
    }
    if(grade <60){
      letGrade = "F";
    }
    return (letGrade+modi);
  }// end lettergrade method
}// end class
