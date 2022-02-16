package QuestionOne;

import java.util.ArrayList;

public class ArrayFunction {
    public static void main(String[] args) {

        //test
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("The length of this array is:" + array.length);
        System. out. println (validArray(array));
    }

    public static int validArray(int[] a) {

        if (a.length > 5) {
            System.out.println("Arrays with more than 5 elements are invalid");
            return -1;
            }

            //initialize min and max values to first array element
            int minVal = a[0];
            int maxVal = a[0];
            int sum = 0;

            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    System.out.println("this array has a negative element");
                    return 0;
                }

                //find min and max value
                if (a[i] < minVal) {
                    System.out.println("min value is now: " + minVal);
                    minVal = a[i];

                } else if (a[i] > maxVal) {
                    System.out.println("max value is now: " + maxVal);
                    maxVal = a[i];
                }

            }

            //sum
            sum = minVal + maxVal;
            return sum;
        }
    }

