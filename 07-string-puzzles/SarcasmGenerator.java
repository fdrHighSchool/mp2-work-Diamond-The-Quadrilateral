class SarcasmGenerator {
  public static void main(String[] args) {
    System.out.println(sarcasmGenerator("Hello World"));
  }
  public static String sarcasmGenerator(String s){
  String newString = "";
  for(int i = 0; i < s.length(); i++){
    String character = s.substring(i,i+1);
  if(i%2 == 0){
    newString += character.toLowerCase();
  }else{
    newString +=character.toUpperCase();
  }
  //if(s.substring(i-1)
  }// end for loop
  return newString;  
  }// end sarcGen
}// end SarcasmGenerator class
