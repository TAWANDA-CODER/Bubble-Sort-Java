public class Main {
    // Driver method
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Bubble Sort");
        System.out.println("--------------------");
        BubbleSort oc = new BubbleSort();
        int arr_bubble[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Given array:");
        oc.printArray(arr_bubble);
        oc.bubbleSort(arr_bubble);
        System.out.println();
        System.out.println("Sorted array:");
        oc.printArray(arr_bubble);
        System.out.println();

        
    }


}