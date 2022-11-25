import java.util.Scanner;



public class NDhoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float R;

        System.out.print("Nhap ban kinh hinh tron : ");

        R = sc.nextFloat();
        // tinh P,S hinh tron
        System.out.println("Chu vi la : " +Math.ceil(chuVi(R)));
        System.out.print("Dien tich la : " +Math.ceil(dienTich(R)));

    }
    public static double dienTich(float R){
        int P ;
        return Math.PI*Math.pow(R,2);

    }

    public static double chuVi(float R){
        int P ;
        return 2*Math.PI*R;

    }


}

