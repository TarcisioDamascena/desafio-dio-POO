import com.desafio.dominio.Bootcamp;
import com.desafio.dominio.Curso;
import com.desafio.dominio.Dev;
import com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();


        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso Java");
        curso.setCargaHoraria(2);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(3);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        dev1.setNome("Tarcisio");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("------");
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXpTotal());
        System.out.println("------");


        dev2.setNome("Zezão");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXpTotal());
        System.out.println("------");
    }
}