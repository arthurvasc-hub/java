package edu.arthur.gettersSetters;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setAge(25);
        felipe.setName("Arthur Vasconcelos");

        System.out.println("O aluno " + felipe.getName() + " tem " + felipe.getAge() + " anos");
    }
}
