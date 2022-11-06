package basic_java_questions;

public class OccurancesOfEackElement {
    public static void main(String[] args) {

        // 3. Question :
        /*
         * Count the words in a String one by one and print each of occurances
         *
         * For Example: Input : String is "Dave came to school and Mary came to
         *  school"
         * Output : Dave=1, came=2, to=2, school=2, and=1, Mary=1
         */


        String str="Dave came to school and Mary came to school";
        String[] arr =str.split(" ");

        int count=0;

        for (int i = 0; i < arr.length ; i++) {
            count =0;
            String str1 = arr[i];
            for (int j = 0; j < arr.length; j++) {
                String str2 = arr[j];
                if (str1.equals(str2) & i > j) {break;}
                if (str1.equals(str2)) {count++;}
            }
            if (count != 0) {System.out.print(str1 + " = " + count +"   ");}
        }
    }
}
