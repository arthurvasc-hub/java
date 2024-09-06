public class Debugging {
        public static void main(String[] args) throws Exception {
            System.out.println("Entrou no método main!");
            a();
            System.out.println("Finalizou o método main!");
        }
        static void a(){
            System.out.println("Entrou no método 'a'. ");
            b();
            System.out.println("Finalizou o método 'a'. ");
        }
        static void b(){
            System.out.println("Entrou no método 'b'. ");
            for(int i = 0; i <= 4; i++)
            System.out.println("Laço do método 'b': " + i);
            c();
            System.out.println("Finalizou o método 'b");
        }

        static void c(){
            System.out.println("Entrou no método 'c'. ");
            System.out.println("Finalizou o método 'c'. ");
        }
    }

