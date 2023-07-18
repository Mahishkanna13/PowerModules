import java.util.Scanner;

public class PowerOfModules {
    public static int Divide(int base,int power,int divisor)
    {
        base=base%power;
        int result=1;
        for(int i=1;i<=power;i++)
        {
            result=base%divisor;
        }
        return result%divisor;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Base=scanner.nextInt();
        int power= scanner.nextInt();
        int Divisor= scanner.nextInt();
        System.out.println(Divide(Base,power,Divisor));
    }
}
