package Oct24;

public class ex_0510 {
    public static void main(String[] args){
        int num1;
        int j;
        for (num1=2; num1<=50; num1++)
        {        boolean isPrime=true;

            for (j=2; j<num1; j++)
            {
                if(num1%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num1 + " is a prime number");
            }

        }


    }
}