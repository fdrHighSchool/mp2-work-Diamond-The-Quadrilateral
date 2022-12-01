class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(-123));
  }
  public static String divBy3(int num){
   String strNum = ""+Math.abs(num); // deal w/ negatives
    String ifDiv ="";
   int sum =0;
   for(int i =1 ; i<=strNum.length();++i){
    String loco = strNum.substring(i-1,i);
     sum += Integer.parseInt(loco);
    // System.out.println(loco); //testing
   }
   if(sum%3==0){
    ifDiv=num +" is divisible by 3";
   } else{
     ifDiv = num+" is not divisible by 3";
   }
    return ifDiv;
  }
}
