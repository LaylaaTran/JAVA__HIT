import java.util.Scanner;

public class Bai3 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap vao chuoi  :");
        str = sc.nextLine();
        float sum = 0;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
               sum +=(int)c-48;
               count++;
            }
    }
        if(count!=0)
             System.out.println("TRUE" +(float)sum/count);
        else
            System.out.println("FALSE");
    }
}
