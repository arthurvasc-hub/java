public class MinhaClasse {
    
public static void main(String[] args) {
   int year = 1999;
   int month = 03;
   int day = 25;
   String firstName = "Arthur";
   String secondName = "Vasconcelos";
   String fullName = fullName(firstName, secondName);
   String dateOfBirth = dateOfBirth(year, month, day);
   System.out.println(fullName);
   System.out.println(dateOfBirth);
}

public static String fullName(String firstName, String secondName) {
    return firstName.concat(" ").concat(secondName);
}

public static String dateOfBirth(int year, int month, int day) {
    return year + "/" + month + "/" + day;
}
}

