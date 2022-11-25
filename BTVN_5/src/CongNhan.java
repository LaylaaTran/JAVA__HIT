import java.util.Scanner;

public class CongNhan {

    private static Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private String genDer;
    private String address;
    private int hoursWorked;
    private int hourlyRate;

    public void Infor() {
        sc.nextLine();
        System.out.println("input worker's name:");
        setName(sc.nextLine());

        System.out.println("input worker's:");
        setAge(sc.nextInt());

        sc.nextLine();
        System.out.println("input worker's gender:");
        setGenDer(sc.nextLine());

        System.out.println("input worker's address:");
        setAddress(sc.nextLine());

        System.out.println("input worker's hour work:");
        setHoursWorked(sc.nextInt());

        System.out.println("Input worker:");
        setHourlyRate(sc.nextInt());

    }

    public double salary() {
        long luong;
        if(this.hoursWorked < 45) {
            luong = this.hourlyRate*this.hoursWorked;
        }else {
            luong =  (long) ((double) this.hourlyRate*45 + (this.hoursWorked - 45)*this.hourlyRate*3/2);
        }
        return luong;
    }

    public double tax() {
        double thue;
        if(salary() > 300) {
            thue = salary()*20/100;
        }else {
            thue = 0;
        }
        return thue;
    }
    public void Outfo() {
        System.out.printf("%-10s %-15d %-10s %-10s %-10d %-10d %-10f %-15f",getName(),getAge(),getGenDer(),getAddress(),getHoursWorked(),getHourlyRate(),salary(),tax());
    }
    @Override
    public String toString() {
        return "worKer [name=" + name + ", age=" + age + ", genDer=" + genDer + ", address=" + address
                + ", hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate +" , salary= " + salary() + ", tax = " + tax() + "]";
    }


    public CongNhan() {
        super();
        // TODO Auto-generated constructor stub
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenDer() {
        return genDer;
    }

    public void setGenDer(String gender) {
        this.genDer = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n;
        System.out.println("input number worker need store information:");
        n = sc.nextInt();

        CongNhan[] nv = new CongNhan[10];

        for(int i = 0;i < n;i++) {
            nv[i] = new CongNhan();
            nv[i].Infor();
        }
//		for(int i = 0;i < n;i++) {
//			//nv[i].Outfo();
//			System.out.println(nv[i]);
//		}
        int choose;
        do {
            showMenu();
            System.out.println("choose:");
            choose = sc.nextInt();

            switch(choose) {
                case 1:
                    n++;
                    nv[n - 1] = new CongNhan();
                    nv[n - 1].Infor();

                    break;
                case 2:
                    for(int i = 0;i < n;i++) {
                        //nv[i].Outfo();
                        System.out.println(nv[i]);
                    }
                    break;

                case 3:
                    for(int i = 0;i < n;i++) {
                        for(int j = i + 1;j < n;j++) {
                            if(nv[i].getHoursWorked() < nv[j].getHoursWorked() ) {
                                CongNhan tmp = new CongNhan();
                                tmp = nv[i];
                                nv[i] = nv[j];
                                nv[j] = tmp;
                            }
                        }
                    }
                    if(n >= 3)
                        for(int m= 0;m < 3;m++) {
                            System.out.println(nv[m]);
                        }
                    else
                        for(int m= 0;m < n;m++) {
                            System.out.println(nv[m]);
                        }
                    break;

                case 4:
                    sc.nextLine();
                    String search;
                    System.out.println("input name need search:");
                    search = sc.nextLine();
                    for(int i = 0;i < n;i++) {
                        if(nv[i].getName().equals(search)) {
                            System.out.println(nv[i]);
                            break;
                        }

                    }
                    System.out.println("Not Found");
                    break;

                case 5:
                    System.out.println("Goodbye!!!");
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }
        }while(choose != 5);

    }

    static void showMenu() {
        System.out.println("1. Add new worker.");
        System.out.println("2. Display information about list workers.");
        System.out.println("3. Display three worker hard working have many hoursWorked.");
        System.out.println("4. Search follow name.");
        System.out.println("5. Exit the program.");
    }

}