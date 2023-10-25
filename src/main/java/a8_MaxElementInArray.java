public class a8_MaxElementInArray {
    public static void main(String[] args){
        int a[] = {23,40,12,56,94,58};
        int max = a[0];
        for (int i=0;i<=a.length-1;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum element in Array is: "+max);
    }
}
