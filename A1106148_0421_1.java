import java.util.*;
public class A1106148_0421_1{
    public static void main(String[] args){
        
        String email;
        System.out.println("請輸入正確的電子郵件信箱格式(僅能有小寫英文字母):");
        System.out.println("Example:a1106148@mail.nuk.edu.tw");
        System.out.print(":");
        Scanner input = new Scanner(System.in);
        email = input.next();

        if(email.matches("[a-z]{1,20}[0-9]{0,20}[@]{1}[a-z0-9.]{0,30}[.]{1}[a-z]{0,20}")){
            System.out.println("成功輸入!");
        }else{
            System.out.println("您輸入之電子信箱格式有誤!");
        }
    }
}        