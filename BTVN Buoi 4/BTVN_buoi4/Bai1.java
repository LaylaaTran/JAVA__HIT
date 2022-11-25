import java.util.Locale;
import java.util.Scanner;

// Cac ham toan hoc

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap chuooi : ");
        str = sc.nextLine();

         str = str.toLowerCase();
        System.out.println(str);
        char[] a = str.toCharArray();
        int[] count = new int[200];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int[] b = {0};
        for(int i = 0; i < a.length ; i++){
            if(a[i]  != 32 && b[a[i]] == 0  ){
                System.out.println(a[i] + " : " + count[a[i]]);
                b[a[i]] = 1;
            }

        }

//        for (int i = 0; i < count.length; i++) {
//            if (count[i] != 0) {
//                System.out.println(Integer.toString(i) + " :" + count[i]);
//            }
//        }
    }


}

