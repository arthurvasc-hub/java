package edu.arthur.Operadores;

public class Operadores {
    public static void main(String[] args) {
     
    int [] lista = {10, 26, 40, 70 ,100, 200, 500};

    int findNumber = binarySearch(lista, 100);
    System.out.println(findNumber);

    }
    public static int binarySearch(int[] array, int item) {
        int left = 0;
        int right = array.length -1; 
        int count = 0;

         while (left <= right) {
        int middle = (left + right) / 2;
            if(array[middle] == item ){
                count++;
                return item + "nu" count;
            }
            if(array[middle] < item){
                count++;
                left = middle + 1; 
            } else {
                count++;
                right = middle -1;
            }
         } 
    return -1; 
    }     
   
}
