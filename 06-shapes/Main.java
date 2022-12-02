class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    square(10);
    rectangle(5,2);
   rTriangle(3);
  }// main close
  
  public static void square(int reps){
    for(int row = 0; row <reps; row++){
      for(int column = 0;column <reps; column++ ){
    System.out.print("* ");
      }
      System.out.println("");
    }
  }// sqaures close
  
  public static void rectangle(int lens, int width){
    for(int row = 0;row < width; row++){
      for(int column = 0;column < lens; column++ ){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }//close rectangle

  public static void rTriangle(int height){
    for(int row = 0; row <height; row++){
      for(int star = 0;star<=row; star++){
        System.out.print("* ");
      }
    System.out.println("");
     }
  }// close rTriangle

}// class close
