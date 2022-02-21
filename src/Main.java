import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(120);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricacao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabriel" + devGabriel.getConteudosInscritos());

        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("**************---------***********---------*********");

        System.out.println("Conteudos Inscritos Gabriel" + devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gabriel" + devGabriel.getConteudosConcluidos());
        System.out.println("XP: "+ devGabriel.calcularTotalXP());
        System.out.println("**************---------***********---------*********");

        Dev devLuras = new Dev();
        devLuras.setNome("Luras");
        devLuras.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devLuras.getConteudosInscritos());

        devLuras.progredir();
        devLuras.progredir();
        devLuras.progredir();
        System.out.println("**************---------***********---------*********");

        System.out.println("Conteudos Inscritos " + devLuras.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Luras" + devLuras.getConteudosConcluidos());
        System.out.println("XP: "+ devLuras.calcularTotalXP());


    }
}
