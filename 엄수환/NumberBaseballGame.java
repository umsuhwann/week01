import java.util.Scanner;
import java.util.Random;
public class NumberBaseballGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] ranNum = {0, 0, 0};
        int Num,strike,ball,out;
        int[] inNum = {0, 0, 0};
        ranNum[0] = random.nextInt(10);
        while(true){
            ranNum[1] = random.nextInt(10);
            if(ranNum[0]!=ranNum[1]){
                break;
            }
        }
        while(true){
            ranNum[2] = random.nextInt(10);
            if(ranNum[0]!=ranNum[2] && ranNum[1]!=ranNum[2]){
                break;
            }
        }
        System.out.println(ranNum[0]+" "+ranNum[1]+" "+ranNum[2]);
        while(true){
            strike = 0;
            ball =0;
            out = 0;
            System.out.print("3자리 숫자를 입력해주세요>> ");
            Num = scanner.nextInt();
            inNum[0] = Num/100;
            inNum[1] = (Num/10)%10;
            inNum[2] = Num % 10;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(ranNum[i]==inNum[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            out = 3 - strike - ball;
            System.out.println("Strike: " + strike);
            System.out.println("Ball: " + ball);
            System.out.println("Out: " + out);
            if(strike == 3){
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
