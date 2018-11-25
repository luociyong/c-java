public class test {
  public static void main (String[]args){
    double sum;
    Scanner input =new Scanner (System.in);
    System.out.print ("输入当月利润");
    double lirun=input .nextDouble();
    if(lirun<=100000){
      sum=lirun*0.1;
    }else if (lirun<=200000){
      sum=10000+lirun*0.075;
    }else if (lirun<=400000){
      sum=17500+lirun*0.05;
    }else if (lirun<=600000){
      sum=lirun*0.03;
    }else if (lirun<=1000000){
      sum=lirun*0.015;
    } else{
      sum=lirun*0.01;
    }
    System.out.println("应发的奖金是"+sum);
    }
}
