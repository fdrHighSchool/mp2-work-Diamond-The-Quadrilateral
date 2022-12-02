# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`

  * public static boolean isPrime(int num){
  *boolean prime ="true";
  *num = Math.abs(num)
  *if( num/2 == 0 || num/3 == 0|| num/5 ==0 || num/7 ==0){
  *prime = "false"
  *}
  *return prime;
