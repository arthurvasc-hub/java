package edu.arthur.switchCase;

public class SistemaMedida {
    public static void main(String[] args) {
        String canal = "G"; // M, T ou G
        // Não utilizar o "break" póis queremos dar continuidade hierarquica no fluxo.
        switch (canal) {
            case "G":
            System.out.println("5gb de Youtube +");
            case "M":
            System.out.println("Whats e Instagram GRATIS +");
            case "P":
            System.out.println("100 minutos de ligação");
        }
    }
}
