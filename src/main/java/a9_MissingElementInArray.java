public class a9_MissingElementInArray {
    public static void main(String[] args){
        int a[] ={1,2,4,5};
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0;i<=a.length-1;i++){
            sum1 = sum1+a[i];
        }
        System.out.println("Sum of Elements in Array is..."+sum1);
        for (int i=0;i<=5;i++){
            sum2 = sum2+a[i];
        }
        System.out.println("Sum of range of elements in Array is..."+sum2);
        System.out.println("Missing Element in Array is...  :"+(sum2-sum1));
    }
}
