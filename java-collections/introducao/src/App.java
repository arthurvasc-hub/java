import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Arthur");
        list2.add("Vasconcelos");


        for(int num : list){
            System.out.println(num);
        }
        System.out.println(list.get(0));
        list.set(0, 54);
        System.out.println(list.get(0));

        for (String e : list2){
            System.out.println(e);
        }







    }
}
