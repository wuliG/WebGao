package cn.junit.gao;

import org.junit.Test;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args){
     System.out.println("ddd");
    }
    @Test
    public void sort(){
        int[] arr={12,2,1,53};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    @Test
    public void test(){
        System.out.print("shuchu");
    }
}
