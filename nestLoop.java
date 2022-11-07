public class nestLoop {
  public static void main(String[] args){

    int a = 8;
    int b = 10;
    for (int i =0; i <= 1; i++){ //最后在多做一遍
      for (int j = 0; j <= 2; j++){ //刚刚做的,再重复2遍，回到上一个loop
        for (int k = 0; k <=3; k++){
          System.out.println(k); //这里是第一个要你做的事情，做到条件不允许了，再回上一个loop
        }
      }
    }
  }
}
