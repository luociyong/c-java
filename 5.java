public static void main(String[] args){
    int num1=0,num2=0,num3=0;
    Scanner sc=new Scanner(System.in);
    num1=sc.nextInt();
    num2=sc.nextInt();
    num3=sc.nextInt();
    int j;
    if(num1>num2){
        j=num2;
        num2=num1;
        num1=j;
    }
    if(num1>num3){
        j=num3;
        num3=num1;
        num1=j;
    }
    if(num2>num3){
        j=num3;
        num3=num2;
        num2=j;
    }
    System.out.println(num1+" "+num2+" "+num3);
}
