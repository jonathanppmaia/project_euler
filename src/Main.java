public class Main {
    public static void main(String[] args) {
        System.out.println(getSum(10)); //should be 23
        System.out.println(getSum(100));
        System.out.println(getSum(1000));

    }
    public static int getSum(int cap) {
        int sum = 0;
        for (int i = 1; 1 < cap; i++){
            if(i % 3 == 0 | i % 5 == 0){
                sum+= i;  // so if it can be divided on 3 or 5 - add to sum;
            }
        }
        return sum;
    }
}