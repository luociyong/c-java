import java.util.Scanner;

public class asgasaf {

    public static void main(String[] args) {
        int year;
        int mouth;
        int day=0;
        int days;
        int d=0;
        int e = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("������:");
            year = scanner.nextInt();
            System.out.println("������:");
            mouth = scanner.nextInt();
            System.out.println("������:");
            days = scanner.nextInt();
            if (mouth < 0 || mouth > 12 || days < 0 || days > 31) {
                System.out.println("input error!");
                e = 1;
            }
        } while (e == 1);
        for (int i = 1; i <mouth; i++) {
            switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                day = 31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                day = 30;
                break;
            }
            case 2: {
                if ((year % 100 !=0 &&year % 4 == 0) || (year % 100 == 0 && year%400==0)) {
                    day = 29;
                } else {
                    day = 28;
                }
            }
            default:
                break;
            }
            d+=day;
        }
        System.out.println("����"+year+"���"+(d+days)+"��");
    }

}
