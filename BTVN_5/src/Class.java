//package BTVN_5;

import java.util.Scanner;

public class Class {

    private static Scanner sc = new Scanner(System.in);

    private String chuSoHuu;
    private String nameOto;
    private String brandOto;
    private long priceOto;
    private long namMua;

    public double value() {
        double price;
        if(this.priceOto < 1000) {
            price = (this.priceOto - (this.priceOto*0.07*(2022 - this.namMua)));
        }else if(this.priceOto >= 1000  && this.priceOto <= 2000) {
            price = (this.priceOto - (this.priceOto*0.05*(2022 - this.namMua)));
        }else
            price = (this.priceOto - (this.priceOto*0.03*(2022 - this.namMua)));

        return price;
    }
    public Class() {

    }
    public void Infor() {
        sc.nextLine();
        System.out.println("Nhập tên chủ sở hữu:");
        setChuSoHuu(sc.nextLine());

        System.out.println("Nhập tên xe:");
        setNameOto(sc.nextLine());

        System.out.println("Nhập hãng xe:");
        setBrandOto(sc.nextLine());

        System.out.println("Nhập giá mua:");
        setPriceOto(sc.nextLong());

        System.out.println("Nhập năm mua:");
        setYearBought(sc.nextLong());
    }

    public void Xuat() {
        System.out.printf("%-10s %-15s %-10s %-10d %-10d %-10f \n" ,getChuSoHuu(),getNameOto(),getBrandOto(),getPriceOto(),getYearBought(),value());
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }
    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
    public String getNameOto() {
        return nameOto;
    }
    public void setNameOto(String nameOto) {
        this.nameOto = nameOto;
    }
    public String getBrandOto() {
        return brandOto;
    }
    public void setBrandOto(String brandOto) {
        this.brandOto = brandOto;
    }
    public long getPriceOto() {
        return priceOto;
    }
    public void setPriceOto(long priceOto) {
        this.priceOto = priceOto;
    }
    public long getYearBought() {
        return namMua;
    }
    public void setYearBought(long yearBought) {
        this.namMua = yearBought;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào số ô tô:");
        n = sc.nextInt();

        Class[]  a = new Class[n];
        for(int i = 0;i < n;i++) {
            a[i] = new Class();
            a[i].Infor();
        }
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s \n","Chủ sở hữu","Tên xe","Hãng","Giá","Năm sử dụng","Giá trị hiên tại");

        for(int i = 0;i < n;i++) {
            a[i].Xuat();
        }

    }

}
