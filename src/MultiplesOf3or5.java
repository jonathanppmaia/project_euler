public class MultiplesOf3or5 {
    public static void main(String[] args) {
        System.out.println(getSum(1000));

    }
    public static int getSum(int cap) {
        int sum = 0;
        for (int i = 1; i < cap; i++){
            if(i % 3 == 0 | i % 5 == 0){
                sum+= i;
            }
        }
        return sum;
    }
}