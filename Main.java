package SSPKUOJ;
import java.util.*;
public class Main {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // 读取一行

        String[] Strarr = str.trim().split(" ");  // 以空格分割
        int[] arr = new int[Strarr.length];
        for(int i=0;i<Strarr.length;i++){
            arr[i]=Integer.parseInt(Strarr[i]);

        }
        int curMin=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<arr.length;i++){
            curMin=Math.min(curMin,arr[i]);
            res=Math.max(res,arr[i]-curMin);
        }
        System.out.println(res);
    }
}

