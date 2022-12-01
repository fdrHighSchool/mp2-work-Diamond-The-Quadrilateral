class Main {
  public static void main(String[] args) {
    System.out.println (countQuarters(0));
  }
  public static int countQuarters(int cent){
    String stcent = Integer.toString(cent);
    if (cent >=25){
      stcent = stcent.substring(stcent.length() -2);
    } else {
      stcent = "0";
    }
   cent = Integer.parseInt(stcent);
    return cent/25;
  }
}
