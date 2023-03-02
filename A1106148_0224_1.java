import java.util.*;

public class A1106148_0224_1{
    public static void main(String[] argv){
        int num;
        System.out.println("請輸入任意一個整數:");
        Scanner inputNUM = new Scanner(System.in);
        num = inputNUM.nextInt();
        if(num % 2 == 0){
            System.out.println("你輸入的數為偶數");
        }else{
            System.out.println("你輸入的數為奇數");
        }
    }
}