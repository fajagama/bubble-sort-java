package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        
        int [] array = {8, 1, 6, 4, 5, 3, 2, 9, 7};
        
        printArray(array);
        
        myBubbleSort(array);
        
        printArray(array);
        
    }
    
    public static void printArray(int [] array){
    
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    
    }
    
    public static void myBubbleSort(int [] array){
        
        Boolean swapped;
        do{
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {

                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }

            }
        }while(swapped);
        
    }
    
}
