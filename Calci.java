import java.util.Scanner;

public class Calci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("***********************");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Square Values");
        System.out.println("7.Square Root values");
        System.out.println("8.Exit");
        boolean Value=true;
        while(Value != false)
        {
           System.out.println("Enter the Number That you want to perform the operation:");
           int num=s.nextInt();
           switch(num)
           {
            case 1:
            {
                System.out.println("ADDITION OF TWO NUMBERS");
                System.out.println("-------------------------");
                System.out.println("Enter the value for a:");
                int a=s.nextInt();
                System.out.println("Enter the value for b:");
                int b=s.nextInt();
                if(a>=0 && b>=0)
                {
                if(a<=(Integer.MAX_VALUE)/2 && b<=(Integer.MAX_VALUE)/2)
                {
                    int result=a+b;
                    if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
                    {
                        System.out.println("ANSWER:"+result);
                    }
                    else{
                        System.out.println("The resultant will be greater than or lesser than the Range of the Integer");
                    }
                    break;
                }
                else{
                    System.out.println("The given Number is must be under 1,07,37,41,823");
                }
                }
            }
            case 2:
            {
                System.out.println("SUBSTRACTION OF TWO NUMBERS");
                System.out.println("-------------------------");
                System.out.println("Enter the value for a:");
                int a=s.nextInt();
                System.out.println("Enter the value for b:");
                int b=s.nextInt();
                if(a>=0 && b>=0)
                {
                if(a<=(Integer.MAX_VALUE)/2 && b<=(Integer.MAX_VALUE)/2)
                {
                    int result=a-b;
                    if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
                    {
                        System.out.println("ANSWER:"+result);
                    }
                    else{
                        System.out.println("The resultant will be greater than or lesser than the Range of the Integer");
                    }
                    break;
                }
                else{
                    System.out.println("The given Number is must be under 1,07,37,41,823");
                }
                }
                
            }
            case 3:
            {
                System.out.println("MULTIPLICATION OF TWO NUMBERS");
                System.out.println("-------------------------");
                System.out.println("Enter the value for a:");
                int a=s.nextInt();
                System.out.println("Enter the value for b:");
                int b=s.nextInt();
                if(a>=0 && b>=0)
                {
                if(a<=(Integer.MAX_VALUE)/2 && b<=(Integer.MAX_VALUE)/2)
                {
                    int result=a*b;
                    if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
                    {
                        System.out.println("ANSWER:"+result);
                    }
                    else{
                        System.out.println("The resultant will be greater than or lesser than the Range of the Integer");
                    }
                    break;
                }
                else{
                    System.out.println("The given Number is must be under 1,07,37,41,823");
                }
                }
               
            }
            case 4:
            {
                System.out.println("DIVISION OF TWO NUMBERS");
                System.out.println("-------------------------");
                System.out.println("Enter the value for a:");
                int a=s.nextInt();
                System.out.println("Enter the value for b:");
                int b=s.nextInt();
                if(a>=0 && b>=0)
                {
                if(a<=(Integer.MAX_VALUE)/2 && b<=(Integer.MAX_VALUE)/2)
                {
                    int result=a/b;
                    if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
                    {
                        System.out.println("ANSWER:"+result);
                    }
                    else{
                        System.out.println("The resultant will be greater than or lesser than the Range of the Integer");
                    }
                    break;
                }
                else{
                    System.out.println("The given Number is must be under 1,07,37,41,823");
                }
                }
                
            }
            case 5:
            {
                System.out.println("MODULUS OF TWO NUMBERS");
                System.out.println("-------------------------");
                System.out.println("Enter the value for a:");
                int a=s.nextInt();
                System.out.println("Enter the value for b:");
                int b=s.nextInt();
                if(a>=0 && b>=0)
                {
                if(a<=(Integer.MAX_VALUE)/2 && b<=(Integer.MAX_VALUE)/2)
                {
                    int result=a%b;
                    if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
                    {
                        System.out.println("ANSWER:"+result);
                    }
                    else{
                        System.out.println("The resultant will be greater than or lesser than the Range of the Integer");
                    }
                    break;
                }
                else{
                    System.out.println("The given Number is must be under 1,07,37,41,823");
                }
                }
                
            }
            case 6:
            {
                System.out.println("SQUARE VALUES a^b");
                System.out.println("-------------------------");
                System.out.println("Enter the value for a:");
                int a=s.nextInt();
                System.out.println("Enter the value for b:");
                int b=s.nextInt();
                if(a>=0 && b>=0)
                {
                if(a<=(Integer.MAX_VALUE)/2 && b<=(Integer.MAX_VALUE)/2)
                {
                    double result=Math.pow(a, b);
                    if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
                    {
                        System.out.println("ANSWER:"+result);
                    }
                    else{
                        System.out.println("The resultant will be greater than or lesser than the Range of the Integer");
                    }
                    break;
                }
                else{
                    System.out.println("The given Number is must be under 1,07,37,41,823");
                }
                }
               
            }
            case 7:
            {
                System.out.println("SQUARE ROOT VALUES");
                System.out.println("-------------------------");
                System.out.println("Enter the value for a:");
                int a=s.nextInt();
                if(a>=0 )
                {
                if(a<=(Integer.MAX_VALUE)/2)
                {
                    double result=Math.sqrt(a);
                    if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
                    {
                        System.out.println("ANSWER:"+result);
                    }
                    else{
                        System.out.println("The resultant will be greater than or lesser than the Range of the Integer");
                    }
                    break;
                }
                else{
                    System.out.println("The given Number is must be under 1,07,37,41,823");
                }
                }
               
            }
            case 8:
            {
                Value=false;
                break;
            }
           }
        }
    }
}