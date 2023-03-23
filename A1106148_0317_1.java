import java.util.Scanner;

public class A1106148_0317_1{
    public static void main(String[] args){
        System.out.printf("請輸入一個n值來算出n*m：\n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("請輸入一個m值來算出n*m：\n");
        int m = input.nextInt();
        
        int[][] arr = new int[n][m];
            
        for(int i=0; i<n; i++){
            for(int j=0; j<m ; j++){
                int result=0;
                result=(i+1) * (j+1);
                arr [i][j]=result;
            }
        }
        System.out.printf("讀出來的二維陣列n*m為：\n");
        for(int[] x:arr){
            for(int value:x){ 
                System.out.printf(value+ "\t");
            }
            System.out.println();
        }
    }
}