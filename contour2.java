import java.util.*;
class contour2{
    
    public static void main(String[] args){
        
        int[][] array = {{3,4,6,11},{2,21,7,9},{1,5,12,3}};
        
        int sum = 0;
        
        int a = array.length;
        
        for (int i=0; i<array[0].length; i++) {
            if (array[0][i]%2 == 0) {
            }
            else {
                sum = sum + array[0][i];
                System.out.println(array[0][i]);
            }
        }
        System.out.println("First row done");
        
        if (array.length>=3) {
            for (int j=1; j<a-1; j++) {
                if (array[j][0]%2 == 0) {
                }
                else {
                    sum = sum + array[j][0];
                    System.out.println(array[j][0]);
                }
                System.out.println("First column done");
                if (array[j].length-1 != 0) {
                    if (array[j][array[j].length-1]%2 == 0) {
                    }
                    else {
                        sum = sum + array[j][array[j].length-1];
                        System.out.println(array[j][array[j].length-1]);
                    }
                }
                System.out.println("Last column done");
            }
        }
        
        if (array.length>=2) {
            for (int k=0; k<array[0].length; k++) {
                if (array[a-1][k]%2 == 0) {
                }
                else {
                    sum = sum + array[a-1][k];
                    System.out.println(array[a-1][k]);
                }
            }
        }
        System.out.println("Last row done");
        
        System.out.println(sum);
        
        
    }
    
}