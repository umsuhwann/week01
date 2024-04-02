import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select=0, num_1 =0,num_2=0;
        while(true) {
            System.out.println("==== 지원하는 연산 ====");
            System.out.println("1.  +  (더하기)");
            System.out.println("2.  -  (빼기)");
            System.out.println("3.  *  (곱하기)");
            System.out.println("4.  /  (몫)");
            System.out.println("5.  %  (나머지)");
            System.out.println("6.  종료");
            System.out.println("====================");
            System.out.println("수행하고 싶은 연산을 선택해주세요>> ");
            select = scanner.nextInt();
            if (select == 6) {
                System.out.print("프로그램이 종료되었습니다.");
                break;
            }
            System.out.print("첫번째 피연산자를 입력해주세요>> ");
            num_1 = scanner.nextInt();
            System.out.print("두번째 피연산자를 입력해주세요>> ");
            num_2 = scanner.nextInt();
            if (select == 1) {
                System.out.println(num_1 + " + " + num_2 + " = " + (num_1 + num_2));
            } else if (select == 2) {
                System.out.println(num_1 + " - " + num_2 + " = " + (num_1 - num_2));
            } else if (select == 3) {
                System.out.println(num_1 + " * " + num_2 + " = " + (num_1 * num_2));
            } else if (select == 4) {
                System.out.println(num_1 + " / " + num_2 + " = " + (num_1 / num_2));
            } else if (select == 5) {
                System.out.println(num_1 + " % " + num_2 + " = " + (num_1 % num_2));
            }
        }
    }
}
