class RepeatEnd {
  public static void main(String[] args) {
    System.out.println(repeatEnd("Hello",3));
    
  }
  public static String repeatEnd(String word, int num){
    String repped = "";
    for(int i = 0;i<num;i++){
      repped += word.substring(num-1);
    }

    return repped;
  }// end repeatEnd MO
}// end RepeatEnd Class
