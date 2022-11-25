import java.util.Locale;
import java.util.Scanner;

public class Bai4 {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap vao chuoi can chuan hoa :");
        str = sc.nextLine();
        // xoa khoang trang 2 dau
        str = str.trim().toLowerCase();
        // xoa khoang trang o giua
        while (str.indexOf("  ") != -1) str = str.replaceAll("  "," ");



        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                str = str.replace(String.valueOf(c),"");
                i--;
            }
        }


        String temp[] = str.split(" ");
        str = "";
        for(int i = 0; i < temp.length ; i++){
            str += String.valueOf(temp[i].charAt(0)).toUpperCase()+ temp[i].substring(1);
            if(i < temp.length - 1) str +=" ";
        }


        System.out.println(str);
    }
}
