public class totalAndMax_array {
    public static void main(String[] agrs){
        int array[] = { 5,5,5,5,5,5,5,5,5,9};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("tong bang: " + total);
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > max){
                total = array[i];
                array[i] = max;
                max = total;
            }
        }
        System.out.println("GTLN la "+ max);

    }

}
