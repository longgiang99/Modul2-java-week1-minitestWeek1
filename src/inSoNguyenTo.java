import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class inSoNguyenTo {

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao 1 so");
        int isPrime = scanner.nextInt();
        System.out.println("cac snt nho hon "+ isPrime+ " la");
        for (int i = 0; i < isPrime; i++) {
            if(check(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean check(int num){
        if ( num <= 1 ){
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }

}
