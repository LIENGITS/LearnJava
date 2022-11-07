public class overloading {
  public static void main(String[] args) {


    int k = sum(8,9);
    double z = sum(8.8, 9.9);
    System.out.println(k);
    System.out.println(z);

  }

  public static int sum(int a, int b){
    return a + b;
  }

  //overloading method with the same method name but diff parameter
  public static double sum(double a, double b){
    return a + b;
  }
}
