public class a5_DuplicateElementInArray {
    public static void main(String[] args){
        String a[] = {"java","c","c++","c#","selenium","c#"};
        boolean flag = false;
        for (int i=0;i<=a.length-1;i++){
            for (int j=i+1;j<=a.length-1;j++){
                if (a[i].equals(a[j])){
                    System.out.println("Found duplicate element:"+a[i]);
                    flag = true;
                }
            }
        }
        if (flag = false){
            System.out.println("Duplicate element not found");
        }
    }
}
