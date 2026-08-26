import java.util.Arrays;
import java.util.Scanner;
public class Leetcode217
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i =0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i =1;i<n;i++)
            
        {
            if(arr[i] == arr[i-1])
            {
                System.out.println("true");
            }
            
        }
        System.out.println("false");

    }
}