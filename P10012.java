package SSPKUOJ;
import java.util.*;
public class P10012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int[] query = new int[m];
        for(int j=0;j<m;j++){
            query[j]=input.nextInt();
        }
        for(int j=0;j<m;j++){
            System.out.println(arr[query[j]-1]);
        }

    }
}
