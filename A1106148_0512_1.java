import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class A1106148_0512_1 {
    private static int Pork_dumpling = 5000;
    private static int Beef_dumpling = 3000;
    private static int Veg_dumpling = 1000;

    public static synchronized void dumpling_consumption() {
        
        int dumpling_Order = (int) (Math.random() * (50 - 10 + 1)) + 10;
        int dumpling_Type = (int) (Math.random() * (3 - 1 + 1)) + 1;
       
        if (dumpling_Type == 1 && Pork_dumpling != 0) {
            if (Pork_dumpling >= dumpling_Order) {
                int tmp = Pork_dumpling;
                tmp = tmp - dumpling_Order;
                Pork_dumpling = tmp;
                System.out.println("本次賣出豬肉水餃:" + dumpling_Order +"顆");
                System.out.println("豬肉水餃剩下:" + Pork_dumpling +"顆");
            } else {
                System.out.println("本次賣出豬肉水餃:" + Pork_dumpling +"顆");
                Pork_dumpling = 0;
                System.out.println("豬肉水餃都已賣完了!");
            }
        } else if (dumpling_Type == 2 && Beef_dumpling != 0) {
            if (Beef_dumpling >= dumpling_Order) {
                int tmp = Beef_dumpling;
                tmp = tmp - dumpling_Order;
                Beef_dumpling = tmp;
                System.out.println("本次賣出牛肉水餃:" + dumpling_Order +"顆");
                System.out.println("牛肉水餃剩下:" + Beef_dumpling +"顆");
            } else {
                System.out.println("本次賣出牛肉水餃:" + Beef_dumpling +"顆");
                Pork_dumpling = 0;
                System.out.println("牛肉水餃都已賣完了!");
            }
        } else if (dumpling_Type == 3 && Beef_dumpling != 0) {
            if (Veg_dumpling >= dumpling_Order) {
                int tmp = Veg_dumpling;
                tmp = tmp - dumpling_Order;
                Veg_dumpling = tmp;
                System.out.println("本次賣出蔬菜水餃:" + dumpling_Order +"顆");
                System.out.println("蔬菜水餃剩下:" + Veg_dumpling +"顆");
            } else {
                System.out.println("本次賣出蔬菜水餃:" + Veg_dumpling +"顆");
                Veg_dumpling = 0;
                System.out.println("蔬菜水餃都已賣完了!");
            }
        }
    }
    public static void main(String[] args) {
        int count = 1;
        int Cus_num = getNumCustomers();
        while (count != 0) {
            for (int i = 0; i < Cus_num; i++) {
                dumpling_consumption();
            }
            System.out.println("===================================");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            count = Pork_dumpling + Beef_dumpling + Veg_dumpling;
        }
        if (count == 0) {
            System.out.printf("全部的水餃都已賣完！");
        }
    }
        
    public static int getNumCustomers() {
        System.out.println("歡迎使用丁丁的水餃店模擬器!");
        System.out.printf("請輸入您想要設定同時光顧的顧客數:");
        Scanner scanner = new Scanner(System.in);
        int Customernum = scanner.nextInt();
        scanner.nextLine();
        return Customernum;
    }
}
    

    

