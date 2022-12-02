class ConCat {
  public static void main(String[] args) {
    System.out.println(conCat("abc","cat"));
    System.out.println(conCat("dog","cat"));
    System.out.println(conCat("abc",""));
  }// end main
  public static String conCat(String word1, String word2){
    String conword ="";
    if((word1!="" && word2 !="")&&(word1.substring(word1.length()-1)).equals(word2.substring(0,1))){
      conword = word1+word2.substring(1);
    } else {
      conword = word1+word2;
    }
    return conword;
  }// end concat
}// end ConCat class
