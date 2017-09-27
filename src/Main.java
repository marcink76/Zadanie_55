public class Main {
    public static void main(String[] args){
        int sum = 0;
        for (int number = 0; number <=100; number++){
            sum += number;
            System.out.println(number);
            number++;
        }
        System.out.println(sum);
    }
}
