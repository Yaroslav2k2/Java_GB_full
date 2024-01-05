package lesson1_Seminar;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,3};
        int val = 3;
        System.out.println(Arrays.toString(sort(arr,val)));
    }
    static int[] sort(int[] arr, int num){
        int[] sortedarr = new  int[arr.length];
        int countVal = arr.length-1;
        int countstart=0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                sortedarr[countVal]=num;
                countVal--;
            }else{
                sortedarr[countstart]=arr[i];
                countstart++;
            }
        }
        return sortedarr;
    }
}
