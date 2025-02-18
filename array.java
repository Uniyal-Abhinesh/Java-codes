import java.util.Arrays;
public class array {
    public static void main(String[] args)
    {   //making an array 
        int arr[]=new int[3];
        arr[0]=94;
        arr[1]=92;
        arr[2]=93;
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println(arr[i]);
        // }

        //sorting using Arrays.sort()function
        System.out.println(arr[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);

    }
    
}
