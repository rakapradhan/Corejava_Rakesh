public class a7_FindEvenAndOdd {
    public static void main(String[] args){
        int a[] = {1,3,5,2,6,9,7,8};
        System.out.println("Even numbers in Array:");
        for (int i=0;i<=a.length-1;i++){
            if (a[i]%2 == 0){
                System.out.print(a[i]);
            }
        }
        System.out.println("\nOdd numbers in array: ");
        for (int i=0;i<=a.length-1;i++){
            if (a[i]%2 != 0){
                System.out.print(a[i]);
            }
        }
    }
}
