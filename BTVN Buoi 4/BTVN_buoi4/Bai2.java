import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        int Maxx = 0;


        String check;
        for(int i = 0; i < str2.length()-1 ; i++){
            for(int j = i+1 ; j < str2.length(); j++){
                if(str2.charAt(i)==' '){
                    continue;
                }else{
                     check = str2.substring(i,j+1);
                }


                if(str1.contains(check) ){
                    Maxx = Math.max(Maxx,check.length());

                }
            }
        }
        System.out.println(Maxx);
    }
}
