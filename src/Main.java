import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
//    Binary Search [search from middle]
//    public static void main(String[] args) {
//        Integer[] intArray = {1, 3, 5, 6, 7, 8, 9};
//        int target = 4;
//
//        System.out.println(binarySearch(intArray, target));
//    }
//
//    private static int binarySearch(Integer[] intArray, int target) {
//        int start = 0;
//        int end = intArray.length - 1;
//
//        while (start <= end) {
//            int middle = (start + end) / 2;
//
//            if (target < intArray[middle]) {
//                end = middle - 1;
//            } else if (target > intArray[middle]) {
//                start = middle + 1;
//            } else {
//                return middle;
//            }
//        }
//
//        return -1;
//    }

//    Linear Search (ForLoop)
//    public static void main(String[] args) {
//        Integer[] intArray = {1, 4, 5, 7, 8, 9};
//        int target = 5;
//
//        System.out.println(linearSearch(intArray, target));
//    }
//
//    private static int linearSearch(Integer[] intArray, int target) {
//        for (int i = 0; i < intArray.length; i++) {
//            if (intArray[i] == target) {
//                return i;
//            }
//        }
//
//        return -1;
//    }

//    Interpolation Search (Guess)
//    public static void main(String[] args) {
//        Integer[] intArray = {1, 2, 3, 4, 5, 7, 8, 9};
//        int target = 1;
//
//        System.out.println(interpolationSearch(intArray, target));
//    }
//
//    private static int interpolationSearch(Integer[] intArray, int target) {
//        int low = 0;
//        int high = intArray.length - 1;
//
//        while (target >= intArray[low] && target <= intArray[high] && low <= high) {
//            int probe = low + ((high - low) * (target - intArray[low]) / (intArray[high] - intArray[low]));
//            System.out.println(probe);
//            if (target < intArray[probe]) {
//                high = probe - 1;
//            } else if (target > intArray[probe]) {
//                low = probe + 1;
//            } else {
//                return probe;
//            }
//        }
//
//        return -1;
//    }

//    Bubble Sort (Compare both and move biggest to behind)
//    public static void main(String[] args) {
//        Integer[] intArray = {2, 5, 10, 6, 1, 9, 4, 7, 3};
//        bubbleSort(intArray);
//        System.out.println(Arrays.toString(intArray));
//    }
//
//    private static void bubbleSort(Integer[] intArray) {
//        for (int i = 0; i < intArray.length - 1; i++) {
//            for (int j = 0; j < intArray.length - 1 - i; j++) {
//                if (intArray[j] > intArray[j + 1]) {
//                    int temp = intArray[j];
//                    intArray[j] = intArray[j + 1];
//                    intArray[j + 1] = temp;
//                }
//            }
//        }
//    }

//    Selection Sort (Move smallest to the first)=
//    public static void main(String[] args) {
//        Integer[] intArray = {2, 5, 10, 6, 1, 9, 4, 7, 3};
//        selectionSort(intArray);
//        System.out.println(Arrays.toString(intArray));
//    }
//
//    private static void selectionSort(Integer[] intArray) {
//        for (int i = 0; i < intArray.length - 1; i++) {
//            int min = i;
//            for (int j = 1 + i; j < intArray.length; j++) {
//                if (intArray[j] < intArray[min]) {
//                    min = j;
//                }
//            }
//
//            int temp = intArray[i];
//            intArray[i] = intArray[min];
//            intArray[min] = temp;
//            System.out.println(Arrays.toString(intArray));
//        }
//    }

//    Insertion Sort (Start from second index and compare to front [sorted part], if bigger than the index, move to right)
//    public static void main(String[] args) {
//        Integer[] intArray = {2, 5, 10, 6, 1, 9, 4, 7, 3};
//        insertionSort(intArray);
//        System.out.println(Arrays.toString(intArray));
//    }
//
//    private static void insertionSort(Integer[] intArray) {
//        for (int i = 1; i < intArray.length; i++) {
//            int current = intArray[i];
//            int j = i - 1;
//            while (j >= 0 && current < intArray[j]) {
//                intArray[j + 1] = intArray[j];
//                j--;
//            }
//
//            intArray[j + 1] = current;
//        }
//    }

//    Recursion (2 * 2 * 2 * 2 * 2 * 2)
//    public static void main (String[] args) {
//        System.out.println(recursionPower(2, 6));
//    }
//
//    private static int recursionPower(int base, int times) {
//        if (times == 1) {
//            return base;
//        }
//
//        return base * recursionPower(base, times - 1);
//    }

//    Merge Sort (Split into two until unsplitable)
//    public static void main(String[] args) {
//        Integer[] intArray = {2, 5, 10, 6, 1, 9, 4, 7, 3};
//
//        mergeSort(intArray);
//
//        System.out.println(Arrays.toString(intArray));
//    }
//
//    private static void mergeSort(Integer[] intArray) {
//        if (intArray.length <= 1) {
//            return;
//        }
//
//        int middle = intArray.length / 2;
//        Integer[] leftArray = new Integer[middle];
//        Integer[] rightArray = new Integer[intArray.length - middle];
//
//        int j = 0;
//        for (int i = 0; i < intArray.length; i++) {
//            if (i < middle) {
//                leftArray[i] = intArray[i];
//            } else {
//                rightArray[j] = intArray[i];
//                j++;
//            }
//        }
//
//        mergeSort(leftArray);
//        mergeSort(rightArray);
//        merge(leftArray, rightArray, intArray);
//    }
//
//    private static void merge(Integer[] leftArray, Integer[] rightArray, Integer[] intArray) {
//        int leftSize = leftArray.length;
//        int rightSize = rightArray.length;
//        int l = 0;
//        int r = 0;
//        int i = 0;
//
//        while (l < leftSize && r < rightSize) {
//            if (leftArray[l] < rightArray[r]) {
//                intArray[i] = leftArray[l];
//                i++;
//                l++;
//            } else {
//                intArray[i] = rightArray[r];
//                i++;
//                r++;
//            }
//        }
//
//        while (l < leftSize) {
//            intArray[i] = leftArray[l];
//            i++;
//            l++;
//        }
//
//        while (r < rightSize) {
//            intArray[i] = rightArray[r];
//            i++;
//            r++;
//        }
//    }

//    Quick Sort (Select a pivot and use it to separate entire array into two part [smaller and bigger])
//    public static void main (String[] args) {
//        Integer[] intArray = {2, 5, 10, 6, 1, 9, 4, 7, 3};
//        quickSort(intArray, 0, intArray.length - 1);
//        System.out.println(Arrays.toString(intArray));
//    }
//
//    private static void quickSort(Integer[] intArray, int start, int end) {
//        if (end <= start) {
//            return;
//        }
//
//        int pivot = partition(intArray, start, end);
//        quickSort(intArray, start, pivot - 1);
//        quickSort(intArray, pivot + 1, end);
//    }
//
//    private static int partition(Integer[] intArray, int start, int end) {
//        int pivot = intArray[end];
//        int i = start - 1;
//
//        for (int j = start; j < end; j++) {
//            if (intArray[j] < pivot) {
//                i++;
//                int temp = intArray[i];
//                intArray[i] = intArray[j];
//                intArray[j] = temp;
//            }
//        }
//
//        i++;
//        int temp = intArray[end];
//        intArray[end] = intArray[i];
//        intArray[i] = temp;
//        return i;
//    }

//    Binary Search Tree
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Node(3));
        bst.insert(new Node(1));
        bst.insert(new Node(7));
        bst.insert(new Node(2));
        bst.insert(new Node(9));
        bst.insert(new Node(10));

        bst.displayLevel();

        System.out.println(bst.depth());
    }
}