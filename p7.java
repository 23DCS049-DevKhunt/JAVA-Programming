import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String st=sc.next();

        System.out.println("Enter number of times that you want to print the string :");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(st.substring(0,3));

        }
    }
}

