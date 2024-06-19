import com.desafio.dominio.Curso;
import com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();


        curso.setTitulo("Curso Java orientação a objeto");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(2);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}