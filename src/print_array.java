import java.util.Scanner;
public class print_array {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int size;
        int arr[];
        System.out.println(" nhap do dai mang");
        size = scanner.nextInt();
        arr = new int[size];
        int b = 0;
        while (b < arr.length){
            arr[b] = scanner.nextInt();
            b++;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
