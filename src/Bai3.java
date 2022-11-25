import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = 0, count=1;
        for(int i = 0 ; i < n-1 ; i++){
            if(a[i] < a[i+1]){
                count++;
            }else{
                max = count;
                count = 1;
            }
        }
        if(max < count){
            max = count;
        }
        System.out.print(+max);
    }
}

