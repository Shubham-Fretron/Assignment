package day1;
//program to find the second smallest element in an array.

class AssignmentFirst {

    public static void main(String[] args) {

        int[] arr = {0, -1, 8, 3, 11, 8, 5};
        if (arr.length >= 2) {
            int smallest = Integer.MAX_VALUE;
            int s_smallest = Integer.MAX_VALUE;  // second smallest


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < s_smallest && arr[i] > smallest) {
                    s_smallest = arr[i];
                }
            }
            System.out.println(s_smallest);
        }
    }
}
