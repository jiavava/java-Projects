public class Test6_26 {
    public static void main(String[] args) {
        int count ;
        int i = 1;
        for (count=1;count<=100;i++){
            if (isPalindrome(i)&&isPrime(i)){
                //if (isPrime(i)){
                    if (count%10==0)
                        System.out.println(i);
                    else
                        System.out.print(i+"  ");
                    count++;
               // }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=3)
            return n>1;
        if (n%2==0)
            return false;
        for (int i=3;i<=Math.sqrt(n);i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int reverse(int number) {
            int i , result = 0;
            while (number != 0) {
                i = number % 10;
                result = result * 10 + i;
                number = number / 10;
            }
            return result;
        }
    public static boolean isPalindrome(int number){
            return number == reverse(number);
        }
}
