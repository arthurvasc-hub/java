package edu.arthur.consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;




public class ConsumerExample {

    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

    public void executar() {
        numeros.stream().forEach(n -> {
        if(n % 2 == 0){
            System.out.println(n);
        }
      });
    }

    public static void main(String[] args) {
        ConsumerExample consumerExample = new ConsumerExample();

        consumerExample.executar();
    }
}