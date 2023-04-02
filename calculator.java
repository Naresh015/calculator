import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first varible:: ");
        int a=sc.nextInt();
        System.out.print("Enter second variable:: ");
        int b=sc.nextInt();
        calc(a,b);
       


        
        
    }
    
    private static void calc(int a, int b) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition\n"+"2.Subtraction\n"+"3.multiplication\n"+"4.Division");
            System.out.print("choose any of them:: ");
            int n=sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println(a/b);
                    break;
            
                default:
                    break;
            }
            System.out.print("Do want to repeat(y/n):: ");
            char ch=sc.next().charAt(0);
            if(ch=='y'){
                calc(a, b);
            }
            else{
                System.out.println("Completed");
            }
    }
}
