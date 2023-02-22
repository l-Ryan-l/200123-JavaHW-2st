import java.io.FileWriter;
import java.io.IOException;

//Task 2:
//Реализуйте алгоритм сортировки пузырьком числового массива,
//результат после каждой итерации запишите в лог-файл.
public class Task2_SortingAndLogging {
    public static void main(String[] args) {
//        int[] array = {5, 8, 1, 6, 7, 4, 2};
        int[] array = new int[10];
        FillArray(array);
        FileWriter writerInFile;
        try {
            writerInFile = new FileWriter("logFile.txt", false);
            int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < (array.length - i); j++) {
                    if (array[j - 1] > array[j]){
                        temp = array[j -1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
                writerInFile.write("Iteration" + i + ": ");
                for (int k = 0; k < array.length; k++) {
                    writerInFile.write(array[k] + " ");
                }
                writerInFile.write("\n");
            }
            writerInFile.close();
        }
        catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void FillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*9);
        }
    }
}
