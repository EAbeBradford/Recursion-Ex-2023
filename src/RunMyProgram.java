public class RunMyProgram {
    public int num;
    public static void main(String [] args)
    {
        RunMyProgram p = new RunMyProgram();
       // int ans = p.recursiveMethod(20);
        p.recursiveMethod(20);
        System.out.println("ans = "+p.num);
    }

    public void recursiveMethod(int n){

        System.out.println(num);
        num = n;
        if (n < 1)
        {
            num = n+0;
            //System.out.println(num);
        }
        else
        {
            //num = recursiveMethod(num-4)+3;
            System.out.println(num);

            recursiveMethod(n-4);
            num = n+24;
            //System.out.println(n);
        }
        System.out.println(num);
        //return num;
    }
}

