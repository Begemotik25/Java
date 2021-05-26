package Lab1_2;

import java.util.Arrays;
import java.util.Collections;


public class Task {

    public void Func(int[]arr,int value){
        Arrays.sort(new int[][]{arr}, Collections.reverseOrder());
        for(int i=0;i<value;i++){
            System.out.println(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        Task t=new Task();
        int[]arr = {-1,7,8};
        int value=3;
        t.Func(arr,value);
    }
}

