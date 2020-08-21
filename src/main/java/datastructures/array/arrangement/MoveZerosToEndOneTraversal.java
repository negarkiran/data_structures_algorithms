package datastructures.array.arrangement;

public class MoveZerosToEndOneTraversal {
    public void move(int[] array, int n){
        int count = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                temp = array[count];
                array[count] = array[i];
                array[i] = temp;
                count++;
            }
        }
    }
}
