import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int count=0;
        for(int i = 0 ; i < n ; i++){
            if(checkPrime(arr[i]) && Squarate(arr[i])){
                System.out.print(" " +arr[i]);
            }else{
                count++;
            }
        }
        if(count == n  ){
            System.out.print("NO");
        }
    }


    public static boolean checkPrime(int n) {
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if( n % i == 0){
                    return false ;
                }
            }
        return n >= 2;
    }

    public static boolean Squarate(int n){
        int num;
        int count=0;
        while(n > 0){
            num = n%10;
            n/=10;
            if(num == 2 || num == 3|| num == 5 || num == 7 ){
                continue;
            }else{
                return false;

            }

        }
        return true;
    }
}
