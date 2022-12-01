# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
    String modi = "";
    if(score%10 >=7){
    modi = "+";
    }
    return lettergrade + modi // add modifier to the grade later through a custom string
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    *  String modi = "";
    if(score%10 <=2){
    modi = "-";
    }
    return lettergrade + modi // add modifier to the grade later through a custom string


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * if(score%10 >= 7 || score>=100){
  modi = "+";
  } // automatically labels all 100 or over as A+


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * if(score%10 <= 2 && score>=65){ // if score is under 65 no modifiers will be applied
   modi = "-";
  }
