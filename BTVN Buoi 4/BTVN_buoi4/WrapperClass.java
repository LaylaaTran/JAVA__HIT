import java.util.Locale;
import java.util.Scanner;
// wrapper class la chuyen khai abo nguyen thuy ve khai boa doi tuongbbbbbbbbb
public class WrapperClass {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int a = 2;
        Integer b = 1;
        int b1 = b.intValue();
        //Integer c = new Integer(value:);

        float a1 = 2.3F;
        Float d = 2.5F;

        String name = "Tran Thi Thuong ";
        String str = new String("Tran Thi Thuong"); // khoi tao doi tuong str co gia tri
        System.out.println(name.charAt(3));

        // indexOf : vi tri dau tien xuat hien o trong chuoi , lastIndexOf : vi tri cuoi cung xuat hien trong hcuoi
        System.out.println(name.indexOf("h"));
        //phuong thuc to

        String str1 = "nguyen van a";
        System.out.println(str1.toUpperCase(Locale.ROOT));

        // subString lay mot chuoi nao do tu chuoi ban dau : khi truyen chi so
        String str3 = "Hello Moi Nguoi ";
        System.out.println(str3.substring(6));
        System.out.println(str3.substring(6, 9));

        String str4 = "    Nguyen van c     ";
        // in ra "Nguyen Van C"
        // dung
        System.out.println(str4.trim()); // tra ra chuoi khong co dau cahc
        System.out.println(str4);

        String str5 = str4.trim();
        String str6 = " Hello hiii hi";
        System.out.println(str6.replace("Hell", "hi"));
        String str7 = str6.replace("Hell", "hi");
        // phuong thuc compareTo : so sanh

        String str8 = "A", str9 = "B";
        // ap dung khi : sap xep theo thu tu ten tang dan xuong
        String name1 = "Nguyen A";
        String name2 = "Nguyen Van B"; // so sanh ki tu dau tien khac nhau cua ca hai chuoi
        if (name1.compareTo(name2) > 0) {
            // tra ve 3 gia tri -1 0 1
            System.out.println("Nam1> nam2");
        } else {
            System.out.println("name 1 < name 2 ");
        }

        if (name1.compareToIgnoreCase(name2) > 0) { // khong so sanh hoa thuong
            System.out.println("Nam1> nam2");
        } else if (name1.compareToIgnoreCase(name2) == 0) {
            System.out.println("Nam1 <nam2");
        } else {

        }

        // chuoi la ABCDEF
        //charAt(int index) : tra ve mot ki tu tuong ung voi chi so do
        // charAt(3) => D
        // codePointAt(int index) : tra ve gia tri ascii cua ki tu do
        // codePointAt(3) =>
        // codePointBefore : tra ve thu tu ki tu do trong bang ma asscii
        // concat(String st): noi chuoi st vao sau chuoi hien tai
        // ex : str.concat("123"); => ABCDEF123;
        // contains(CharSequence s): tim kiem chuoi con trong chuoi hien thoi
        // string str = "V1Study.com" ; Syste.out.println(str.contains("V1") => in ra : true;
        // contentSquals(CharSequence s) // so sanh chuoi s voi chuoi hien thoi , giong nhau tra ve true , sai ve false
        // copyValueOf(char[] dâta) vd: char [] data ={'a' 'b' 'c'}
        // str = String.copyValueOf(data) ; => str se la abc
        // copyValueOf(char[] data , int offset , int count) // sao chep cac ki tu cua mang tra tu bat dau tu vi tri offset voi so luong count ki tu
        // endsWith(String suffix) kiem tra xem chuoi co ket thuc bang sau suffix k m neu dung tra ve tru , sai tra ve false
        //  str = " condienHI" ; str.endWith("HI") ; ==> true;
        // equals(Object obj) so sanh đối tượng obj với chuooix hiện thời , => true, false
        // equalsIgnoreCase(String str) so sanh k pha biet hoa thuong
        // getBytes() System.out,println("V1Study.getBytes())=> ƠB@1db9742
        // getChars(int Begin, int end, char[] a, int abegin);
        String str10 = "V1Stydy";
        char[] ch = new char[100];
        str10.getChars(0,3,ch,0);
        System.out.println(ch) ; // in ra V1S
        str10.getChars(3,str.length(), ch,3);
        System.out.println(ch); // in ra V1Suty
        // hasCode(); // tra ve ma băm
        //indexOf(int ch) // tra ve mot so nguyen la vi tri theo chi so xuat hien dau tien
        String str11 = "XYZYX";
        str11.indexOf(65); // tra ve -1 vi chuoi khogn co ki tu nao co ma la 65
        str11.indexOf('Y') ; // tra ve 1 vi day la chi so day tien chu Y xuat hien trong chuoi

        // indexOf(int ch, int fromIndex) ;// viec tim kiem va lay chi so bat dau tu chi so from index
        str11.indexOf('Y',2) ; // tra ve gia tri 3

        String str12 = "ABCDEFGHI";
        // indexOf(String st);
        str12.indexOf("CD"); // tra ve 2 vi chuoi CD co trong chuoi str12 ở vị tri chỉ số 2


        //indexOf(String st, int fromIndex)
        str12.indexOf("CD", 3);

        // isEmpty() ;
        String str13 = "V1Study" ;
        System.out.println(str13.isEmpty()); // in ra false
        str13 ="";
        System.out.println(str13.isEmpty());

        //lastIndexOf(int ch);
        System.out.print("Đào tạo lập trình viên".lastIndexOf('t'));
        // in ra gia tri 12 vi ki tu t cuoi cung co chi so al 12

        // lastIndexOf(int ch, int lastIndex)
        String str14 = "ab123ab321" ;
        str14.lastIndexOf(97, str14.length());
        str14.lastIndexOf('b', str14.length());
        // lastIndexOf(String st)
        // length();
        // replace(char oldChar, char newChar);
        String str15 = "a1a2a3";
        str15.replace('a', 'A'); // ==> A1A2A3

        // startsWith(String prefix)
        String str16 = "'V1Study";
        str16.startsWith("V1"); //tra ve true

        //substring(int beginIndex)
        String str17 = "America" ;
        str17.substring(3); // tra ve chuoi rica

        //substring(int beginIndex , int endIndex)
        str17.substring(1,5); // meri

        //toCharArray() ; // chuyen chuoi hien thoi sang 1 mang ki tu neu ban muon thao
        // toLowerCase();// chuyen sang ki tu thuong
        //toUpperCase(); // chuyen sang ki tu hoa
        // trim(); // xoa tat ca khoang trang dau cuoi
        //valueOf(gia_tri) //neu abn chuyen gia tri bat ki nao do sang dang chuoi thi abn su dung den ham nay




    }
}
