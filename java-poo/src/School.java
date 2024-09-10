public class School {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.name = "Joaquim";
        student1.age = 15;
        student1.color = "Fair";
        student1.sex = "Male";

        Student student2 = new Student();
        student2.name = "Joaquina";
        student2.age = 14;
        student2.color = "Dark";
        student2.sex = "Female";


        Student student3 = new Student();
        student3.name = "Joãozin";
        student3.age = 13;
        student3.color = "Fair";
        student3.sex = "Male";

        System.out.println(student1.name);
        
        System.out.println(student2.name);
        
        System.out.println(student3.name);
    }
}
