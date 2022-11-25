import java.util.Scanner;

public class NhanVien {

    static int tempt = 1;

    private int id;
    private String name;
    private int eplt;//Kiểu nhân viên
    private int soNgayLam;
    private int namVaoLam;

    private static Scanner sc = new Scanner(System.in);

    public NhanVien() {
        this.id = tempt++;
    }

    public NhanVien(String name,int eplt,int soNgayLam,int namVaoLam) {
        this.id = tempt++;
        this.name = name;
        this.eplt = eplt;
        this.soNgayLam = soNgayLam;
        this.namVaoLam = namVaoLam;
    }

    public void Info() {
        sc.nextLine();
        System.out.println("Name :");
        setName(sc.nextLine());

        System.out.println("Type of employees: 1. Prduct and 2.Office");
        setEplt(sc.nextInt());

        System.out.println("Sum of work days:");
        setSoNgayLam(sc.nextInt());

        System.out.println("Sum of work years :");
        setNamVaoLam(sc.nextInt());

    }

    public long luong() {
        long LNV = 0;
        if(this.eplt == 1) {
            LNV = (long)this.soNgayLam * 350;

        }else {
            LNV = (long)this.soNgayLam*400;
        }
        return LNV;
    }
    public long phuCap() {
        long pc = 100;
        if(this.namVaoLam < 2022)
            pc = pc + (long)(2022 - this.namVaoLam)*200;

        return pc;
    }

    public long sumMoney() {
        return luong() + phuCap();
    }
    public String xxx() {
        String knv;
        if(getEplt() == 1) {
            knv = "Product";
        }else {
            knv = "Office";
        }
        return knv;
    }
    public void outInfo() {

        System.out.printf("%-10d %-10s %-10s %-15d %-15d %-10d %-10d %-10d \n",getId(),getName(),xxx(),getSoNgayLam(),getNamVaoLam(),luong(),phuCap(),sumMoney());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEplt() {
        return eplt;
    }

    public void setEplt(int eplt) {
        this.eplt = eplt;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }


    public static void main(String[] args) {

        int n;
        System.out.println("Input number employees :");
        n = sc.nextInt();

        NhanVien[] nv = new NhanVien[n];

        for(int i = 0;i < n;i++) {
            nv[i] = new NhanVien();
            nv[i].Info();
        }
        System.out.printf("%-10s %-10s %-10s %-15s %-15s %-10s %-10s %-10s\n", "ID", "Name", "Elpt", "So ngay lam", "Nam vao lam", "Luong", "Phụ Cấp","Tổng tiền");
        for(int i = 0;i < n;i++) {
            nv[i].outInfo();
        }
    }

}