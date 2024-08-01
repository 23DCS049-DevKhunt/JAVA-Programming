import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int arr[]=new int[3];
     int count=0;
        System.out.println("Enter the elements of an array :");
        for (int i =0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<3;i++)
        {
            if(arr[i]==9){
                count++;
            }
        }
        System.out.println("Number 9 appears "+ count + " times ");
    }
}
