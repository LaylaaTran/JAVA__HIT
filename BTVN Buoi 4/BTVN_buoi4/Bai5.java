import java.util.Locale;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap vao so la ma :");
        str = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < str.length() ; i++){
            if(checkNum(str.charAt(i)) >=  checkNum(str.charAt(i+1))){
                sum+=checkNum(str.charAt(i));
            }else{
                sum+=checkNum(str.charAt(i+1)) - checkNum(str.charAt(i));
                i+=2;
            }
        }

        System.out.println("So la ma do la " +sum);
    }

    public static int checkNum(char a ){
        int num = 0;
        switch(a){
            case  'I':
                num = 1;
                break;
            case 'V' :
                num = 5;
                break;
            case 'X':
                num = 10;
            case  'L':
                num = 50;
                break;
            case 'C' :
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
        }
        return num;
    }
}