public class BinarySearchDemo {

    public static void Demo(){

        int[] numbers = {18, 5, 204, 67, 19, 33, 10, 27, 27, 46, 67};
        MergeSortDemo.mergeSort(numbers);//För att göra en binär sökning måste listan vara sorterad!

        int index67 = binarySearch(numbers, 67);

        if(index67 == -1){
            System.out.println("Ingen träff!");
        }
        else{
            System.out.println("Värdet 67 finns på postion " + index67);
        }

    }

    public static int binarySearch(int[] arr, int value){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == value) {
                return mid; //Hittade ett värde
            }

            if (arr[mid] < value){
                left = mid + 1; //Diskvalificerade vänster sidan
            } else {
                right = mid - 1;//Diskavalificerade höger sidan
            }
        }

        return -1;
    }
}
