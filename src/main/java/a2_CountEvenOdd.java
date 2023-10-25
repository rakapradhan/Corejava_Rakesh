import com.sun.source.tree.WhileLoopTree;

public class a2_CountEvenOdd {
    public static void main(String[] args){
        int num = 7825768;
        int Count_Even = 0;
        int Count_Odd = 0;
        while (num>0){
            int rem = num%10;
            if (num%2==0){
                Count_Even++;
            }
            else {
                Count_Odd++;
            }
            num = num/10;
        }
        System.out.println("Count of even number is: "+Count_Even);
        System.out.println("Count of odd number is: "+Count_Odd);
    }

}
