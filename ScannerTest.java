package SSPKUOJ;
import  java.util.*;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s= input.nextLine();
        String[] res=s.trim().split("；");
        int total=0;
        for(String k : res){

            String[] tmp=k.split("：");
            String str=tmp[0];
            int x=Integer.parseInt(tmp[1].trim());
            System.out.println(str+"： "+x);
            total+=x;

        }
        System.out.println("总价格为"+total);
    }
}
