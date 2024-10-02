import edu.arthur.desafio.BootCamp;
import edu.arthur.desafio.Curso;
import edu.arthur.desafio.Dev;
import edu.arthur.desafio.Mentoria;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);
        Mentoria curso2 = new Mentoria();
        curso2.setTitulo("Mentoria JAVA");
        curso2.setDescricao("Descrição mentoria JAVA");


        Curso curso3 = new Curso();
        curso3.setTitulo("Curso JAVASCRIPT");
        curso3.setDescricao("Descrição curso JAVASCRIPT");
        curso3.setCargaHoraria(6);
        Mentoria curso4 = new Mentoria();
        curso4.setTitulo("Mentoria JAVACRIPT");
        curso4.setDescricao("Descrição mentoria JAVACRIPT");


        BootCamp BootCampJava = new BootCamp();
        BootCampJava.setNome("BootCamp Java");
        BootCampJava.setDescricao("Descrição BootCamp Java");
        BootCampJava.getConteudos().add(curso1);
        BootCampJava.getConteudos().add(curso2);

        BootCamp BootCampJavaScript = new BootCamp();
        BootCampJavaScript.setNome("BootCamp JavaScript");
        BootCampJavaScript.setDescricao("Descrição BootCamp JavaScript");
        BootCampJavaScript.getConteudos().add(curso3);
        BootCampJavaScript.getConteudos().add(curso4);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscrever(BootCampJava);

        System.out.println("Cursos Inscritos " + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("Conteudos concluidos " + devArthur.getConteudosConcluidos());
        System.out.println("XP: " + devArthur.calcularTotalXp());
        System.out.println("Cursos Inscritos " + devArthur.getConteudosInscritos());

        System.out.println("----------------");

        Dev devMilene = new Dev();
        devMilene.setNome("Milene");
        devMilene.inscrever(BootCampJavaScript);

        System.out.println("Cursos Inscritos " + devMilene.getConteudosInscritos());
        devMilene.progredir();
        System.out.println("Conteudos concluidos " + devMilene.getConteudosConcluidos());
        System.out.println("XP: " + devMilene.calcularTotalXp());
        System.out.println("Cursos Inscritos " + devMilene.getConteudosInscritos());







    }

}
