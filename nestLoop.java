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


public class nestLoop {
  public static void main(String[] args){

    int [] [] twoDArray = {{2,4,8},
                           {1,3,5}};

    for (int i =0; i <twoDArray.length ; i++){
        for (int j = 0; j <twoDArray[1].length; j++){ //twoDArray[1]是第二行，长度是3
          System.out.println(twoDArray[i][j]); //这里是第一个要你做的事情，做到条件不允许了，再回上一个loop
        }  //twoDArray[0][0]=2  twoDArray[0][1]=4 twoDArray[0][2]=8 twoDArray[0][3]= nonexistent
      }
    }
  }
  //总结如果你要print 2D Array里的所有东西， 列不能超过row的长度；而行不能超过2D Array的长度（这里的长度就是2，
//也就是用逗号分割开来的2个行
