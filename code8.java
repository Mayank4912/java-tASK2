import java.util.*;
class mayank {
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {

            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");

        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }
        if (isMirrorInverse(array))
            System.out.println("Yes array is mirror inverse");
        else
            System.out.println("No array is not mirror inverse");
    }
}