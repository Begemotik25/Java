package Lab1_2;

import java.util.Arrays;

public class Test {

    public void Method(int [] arr,int value) {
        Arrays.sort(arr);
        System.out.println("Sort arr = " + Arrays.toString(arr));
        for(int i=0;i<value;i++){
            System.out.println("Min elements =" + arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Test t=new Test();
        int[]arr = {-1,9,10,2,3,-8};
        int value=3;
        t.Method(arr, value);
    }
}
