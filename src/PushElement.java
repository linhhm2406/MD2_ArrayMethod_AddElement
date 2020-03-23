import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class PushElement {

    public static int[] finalArray (int[] array, int number, int index){
        int size = array.length;
        int[] finalArray = new int[size+1];
        for (int i = 0; i < index; i++) {
            finalArray[i] = array[i];
        }
        finalArray[index] = number;
        for (int i = (index+1); i < finalArray.length; i++) {
            finalArray[i] = array[i-1];
        }
        return finalArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhap vao phan tu thu %d trong %d phan tu: ",i+1,array.length);
            array[i]= input.nextInt();
        }

        System.out.print("Nhap vao gia tri can chen vao mang : ");
        int toInsertArray = input.nextInt();

        System.out.print("Nhap vao vi tri can chan vao mang : ");
        int index = input.nextInt();

        int[] result = finalArray(array,toInsertArray,index);

        System.out.println("Mang ban dau : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.printf("Mang sau khi chen %d vao vi tri %d la : \n",toInsertArray,index);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }
    }
}
