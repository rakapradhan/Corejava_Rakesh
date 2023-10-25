public class a14_SearchAnElement {
    public static void main(String[] args){
        int a[] = {20,52,45,67,14,53};
        int SearchElement = 67;
        boolean flag = false;
        for (int i=0;i<=a.length-1;i++){
            if (SearchElement == a[i]) {
                System.out.println("Element found: "+a[i]);
                flag = true;
                break;
            }
        }
        if (flag=false){
            System.out.println("Element not found");
        }
    }
}
