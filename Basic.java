
public class LearnJava {

  public static void main(String[] args) {
    double a =5.0; 
   int b = (int)a;   //把右边的值 放入左边 ，从大值到小（double to int)要在前面加上小的（data type）
   //boolean c = true;
   //String d = "Hey";
   int a = (int) Math.pow(5, 2);
    int b = (int) Math.random();
   
    //data type: byte -> short -> char -> int -> long -> float -> double
    //operator: + - * / == if && ||(or) 
    /* int sum1 = 5 + 100;
     int sum2 = sum1 + 250;
     int sum3 = sum2 + sum2;
     String gr = "greeting";    //String type and invoke the method*/
   
   
   
    
    System.out.println(gr.toUpperCase());
    System.out.println(gr.length());
    System.out.println(gr.charAt(4));
    System.out.println(gr.indexOf("g"));
    System.out.println(gr.toUpperCase() + " \n\"Bro?\"\n");  //double quto is (\" \") , new line is (\n \n)*/
    
    //boolean a = 5 != 7;  //!= means not equal
    
    /* if statement
    int  time = 9;
  
    if(time < 10) {
      System.out.println("Good morning!");
    }
    else if (time < 20){
    System.out.println("Good day");
    }
    else{
      System.out.println("Good evening");
    }
    
    String tx = "asaxs";
    
    if(tx.equals("burger")) {
      System.out.println("Yay, burger");
    } else if(tx.equals("pizza")) {
      System.out.println("Yay, pizza");
    }else if(tx.equals("iceCream")){
      System.out.println("Yay, iceCream");
    } 
    else {
      System.out.println("ok, something new");
    }
    
    /*switch case
    int day = 90;
    switch(day) {
    case 1: //you need to put space after case
      System.out.println("Monday");
      break;
    case 2:
      System.out.println("Tuesday");
      break;
    case 3:
      System.out.println("Wednesday");
      break;
    case 4:
      System.out.println("Thursday");
      break;
    case 5:
      System.out.println("Friday");
      break;
    case 6:
      System.out.println("Saturday");
    case 7:
      System.out.println("Sunday");
      break;
      default:
        System.out.println("Not a vaild day");*/
    
   
   
    * ----While Loop
    * while(true) { //while loop, when inside () is ture, 
      //keep doing below
      System.out.println("I louve bacon"); 
    }
    
    int  a = 2;     //to know how many loops, uses 5-2
    while (a < 5) {
      System.out.println("I love bacon");
      a++;
    }
    
    *
    *-----Do Loop, always run at least one time
    int a = 7; //do-while loop is different from while-loop 
    do {//becasue it always run code once even it is not true
      System.out.println("I love bacon");
      a++;
    } while(a < 5);
    
    
    //----For Loop, to run exactly number of times
    String [] cars = {"bmw", "vw", "toyota"};
    // this is am Array
    
    for(int i = 0; i < 3; i++) { //0 is start, 3 is the end
      // int i can be anything
      
      System.out.println(cars[i]);
      //Array cars index place(0, 1, 2) represents diff cars
    }
    
    //!!!cleaner way to write for loop ??
    String [] classes = {"Math", "English"};
    
    for(String b : classes) {
      System.out.println(b);
    }
    
    String s ="Magical Mike";
    
    for(int i=0; i< s.length(); i++) {
      System.out.println(s.charAt(i));
    }
    
    //-------break a loop when you want
    for(int i = 0; i < 5; i++) {
      //if you want it exit at 3
      if(i == 3) {
        //break; breaks the loop
        continue; //skip an element in the loop
      }
      
      System.out.println(i);
    }-----
    
    //-----Array
    String[] pets = {"dog", "cat", "lemur"};
    pets[0] = "car"; //change the first thing in the array
    
    System.out.println(pets[0]);
    
    //----Array row and column 
             //column0  1  2
    int [] [] a = { {3, 5, 6}, //row 0
                    {4, 0, 9} }; //row1
    System.out.println(a[1][2]); //So it's 9
    
    char[] character = {'a', 'b', 'c'};
    
    for(int i = 0; i < character.length; i++) {
      System.out.println(character[i]);
      
    for (int i = 0; i < 5; i++) {
      
      for(int j = 0; j < 10; j++) {
        System.out.println(i + " " + j);
      }
      
    }
    
    
  }

}
