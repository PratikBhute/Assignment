package ReverseNum;

public class FactorialClass {
    public int fact(int n)

    {

        int output;

        if(n==1){

            return 1;

        }

        //Recursion: Function calling itself!!

        output = fact(n-1)* n;

        return output;

    }
}
