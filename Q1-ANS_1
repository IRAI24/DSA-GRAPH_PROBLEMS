import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter total no of monkeys: ");
        int n= obj.nextInt();
        System.out.println("monkey consume how many banana: ");
        int k= obj.nextInt();
        System.out.println("monkey consume how many peanuts: ");
        int j= obj.nextInt();
        System.out.println("total no of banana: ");
        int m= obj.nextInt();
        System.out.println("total no of peanuts: ");
        int p= obj.nextInt();
        if(k==0 || j==0){
            System.out.println("INVALID INPUT");return;
        }

       int a=m/k;
       if(m%k!=0) a++;
       int b=p/j;
       if(p%j!=0) b++;
       System.out.println("Total no monkeys in tree:  "  +(n-(b+a)));

    }
}
