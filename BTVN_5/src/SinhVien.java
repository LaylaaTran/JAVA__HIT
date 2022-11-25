import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SinhVien {
    private static Scanner sc = new Scanner(System.in);

    static int tmp = 1;
    private int mSv;
    private String name;
    private String address;
    private long phoneNumBer;
    private float point;

    public SinhVien() {
        this.mSv = tmp++;
    }

    public SinhVien(String namee,String addresss,long phoneNumBerr,float pointt) {
        this.mSv = tmp++;
        this.name = namee;
        this.address = address;
        this.phoneNumBer = phoneNumBerr;
        this.point = pointt;

    }
    public void Infor() {
        sc.nextLine();
        System.out.println("Input student's name:");
        while(true) {
            String ten = sc.nextLine();
            boolean check = setName(ten);
            if(check) {
                break;
            }
        }

        System.out.println("Input student's address:");
        setAddress(sc.nextLine());

        System.out.println("Input student's phone number");
        while(true) {
            long sdt = sc.nextLong();
            boolean check = setPhoneNumBer(sdt);
            if(check) {
                break;
            }
        }

        System.out.println("Input student's mark:");
        while(true) {
            float diem = sc.nextFloat();
            boolean check = setPoint(diem);
            if(check) {
                break;
            }
        }
    }


    public String toString() {
        return "SinhVien [mSv=" + mSv + ", name=" + name + ", address=" + address + ", phoneNumBer=" + phoneNumBer
                + ", point=" + point + "]";
    }

    //public int Menu() {
    //	System.out.println("Nhập số");
    //}

    public int getmSv() {
        return mSv;
    }


    public void setmSv(int mSv) {
        this.mSv = mSv;
    }


    public String getName() {
        return name;
    }


    public boolean setName(String name) {
        String ho = name.trim();
        for(int i = 0;i < ho.length();i++) {
            if(ho.charAt(i) == ' ') {
                this.name = ho;
                return true;
            }
        }
        System.err.println(" Reinput student's name:");
        return false;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public long getPhoneNumBer() {
        return phoneNumBer;
    }


    public boolean setPhoneNumBer(long phoneNumBer) {
        if(phoneNumBer > 1000000 && phoneNumBer < 10000000) {
            this.phoneNumBer = phoneNumBer;
            return true;
        }
        System.err.println("Reinput Student's phone number:");
        return false;
    }


    public float getPoint() {
        return point;
    }


    public boolean setPoint(float point) {
        if(point >= 0.0 && point <= 10.0) {
            this.point = point;
            return true;
        }
        System.err.println("Reinput Student's point:");
        return false;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*int n;
		System.out.println("Nhập số sinh viên cần lưu thông tin là:");
		n = sc.nextInt();
		SinhVien[] sv = new SinhVien[n];

		for(int i = 0;i < n;i++) {
			sv[i] = new SinhVien();
			sv[i].Info();
		}

		for(int i = 0;i < n;i++) {
			System.out.println(sv[i]);
		}*/
        int n;
        System.out.println("Input number student :");
        n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];

        for(int i = 0;i < n;i++) {
            sv[i] = new SinhVien();
            sv[i].Infor();
        }
        ArrayList<SinhVien> sinhVienList = new ArrayList<>();
        int choose;

        for(int i = 0;i < n;i++) {
            sinhVienList.add(sv[i]);
        }

        do {
            showMenu();
            System.out.println("Choose :");
            choose =  sc.nextInt();//Integer.parseInt(sc.nextLine());

            switch(choose) {
                case 1:
                    Collections.sort(sinhVienList, new Comparator<SinhVien>(){

                        public int compare(SinhVien o1,SinhVien o2) {
                            return (int)(o1.getPoint() - o2.getPoint());
                        }
                    });
                    System.out.println("List after sort by point:");
                    System.out.printf("%-10s %-10s %-10s %-10s %-15s \n","Mã sv","Họ tên","Đía chỉ","Số điện thoại","Điểm số");
                    for(SinhVien o: sinhVienList) {
                        System.out.println(o.mSv + "     " + o.name + "     " + o.address + "      " + o.phoneNumBer + "     " + o.point);
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Input name need to find:");
                    String ten = sc.nextLine();
                    int count = 0;

                    for(SinhVien a : sinhVienList) {
                        if(a.getName().equalsIgnoreCase(ten)) {
                            System.out.println(a);
                            count++;
                        }
                    }
                    if(count == 0) {
                        System.out.println("Coundn't find name!");
                    }
                    break;
                case 3:
                    Collections.sort(sinhVienList,new Comparator<SinhVien>() {

                        public int compare(SinhVien b1,SinhVien b2) {
                            return b1.getName().compareTo(b2.getName());
                        }
                    });
                    System.out.println("List after sort by Name:");
                    System.out.printf("%-10s %-10s %-10s %-10s %-15s \n","Mã sv","Họ tên","Đía chỉ","Số điện thoại","Điểm số");
                    for(SinhVien o: sinhVienList) {
                        System.out.println(o.mSv + "     " + o.name + "     " + o.address + "      " + o.phoneNumBer + "     " + o.point);
                    }
                    break;

                case 4:
                    System.out.println("Ok");
                    break;

                default:
                    System.err.println("Wrong input");
                    break;

            }
        }while(choose != 4);

    }
    static void showMenu() {
        System.out.println("1.In danh sách theo thứ tự tăng dần của điểm ");
        System.out.println("2.Tìm kiếm theo tên");
        System.out.println("3.Sắp xếp danh sách theo Tên cho phép theo chiều tăng");
        System.out.println("4.Thoát khỏi chương trình");
    }

}