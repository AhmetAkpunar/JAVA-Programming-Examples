package basic_java_questions;

import java.util.ArrayList;
import java.util.List;

public class RemoveAnElementInArray {
    public static void main(String[] args) {
        /*
         *
         * Input :[1,2,3,4,5,6]
         *
         * element:6
         *
         * Output : [1,2,3,4,5]
         */
        
       int num =1;
       
       int[] arr = {1,2,3,4,5,6};

       List<Integer> listwithoutNum = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            if (num!=arr[i]) {

                listwithoutNum.add(arr[i]);

            }
        }
        System.out.println((listwithoutNum));
    }
}
