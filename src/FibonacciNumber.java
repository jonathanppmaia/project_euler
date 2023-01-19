public class FibonacciNumber {

    public static int solution(int max_value)
    {
        int n0 = 1;
        int n1 = 2;
        int next = 0;
        int sum = 2;

        while(n1 < max_value)
        {
            next = n0 + n1;

            n0 = n1;
            n1 = next;

            if(next %2 == 0)
                sum += next;
        }

        return sum;
    }
    public  static void main( String[] args) {
        System.out.println(solution(4000000));
    }
}
