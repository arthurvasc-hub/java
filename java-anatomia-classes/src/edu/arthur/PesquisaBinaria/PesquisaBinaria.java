package edu.arthur.PesquisaBinaria;

public class PesquisaBinaria {
    public static void main (String[] args) {
        int [] lista = {10, 26, 40, 70 ,100, 200, 500, 650, 721, 723, 910, 1000, 1010, 1023, 1027, 1080, 1999, 2010, 2024, 2027};

        String findNumber = binarySearch(lista, 500);
        System.out.println(findNumber);
        System.out.println();
    }
    public static String binarySearch(int[] array, int item) {
        int left = 0;
        int right = array.length -1; 
        int count = 0;

         while (left <= right) {
        int middle = (left + right) / 2;
            if(array[middle] == item ){
                String result = "Item encontrado: " + item + " /" + " Posição do item: " + middle + " /" + " Quantidade de tentativas: " + count;
                return result;
            }

            if(array[middle] < item){
                left = middle + 1; // Não posso usar return aqui pois acaba o loop
                count++;
            } else {
                right = middle -1;  // Não posso usar return aqui pois acaba o loop
                count++;
            }
         } 
    return "Item não existe na lista"; 
    }     
}
