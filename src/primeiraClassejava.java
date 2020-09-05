package programajava;

import programa.classes.Aluno;

public class cursojava {
    public static void main(String[] args) {

        /*Agora temos um objeto real na memoria*/

        Aluno aluno1 = new Aluno();/*Aqui será o João*/
        aluno1.setNome("João da silva");
        aluno1.setIdade(50);
        aluno1.setDataNacimento("10/10/2020");
        aluno1.setRegistroGeral("555.555");
        aluno1.setNumeroCpf("020.020.020-01");
        aluno1.setNomeMae("Maria da cruz");
        aluno1.setNomePai("Juliano");
        aluno1.setDataMatricula("15/02/2014");
        aluno1.setNomeEscola("Escola de treinamento java Adriel");
        aluno1.setSerieMatriculado("3°");

        System.out.println("Nome é = " + aluno1.getNome());
        System.out.println("Idade é = " + aluno1.getIdade());
        System.out.println("Data de nacimento é = " + aluno1.getDataNacimento());
        System.out.println("Registro geral é = " + aluno1.getRegistroGeral());
        System.out.println("Numero do CPF é = " + aluno1.getNumeroCpf());
        System.out.println("Nome Da Mãe é = " + aluno1.getNomeMae());
        System.out.println("Nome do pai é = " + aluno1.getNomePai());
        System.out.println("Data da Matricula é = " + aluno1.getDataMatricula());
        System.out.println("Nome da escola é = " + aluno1.getNomeEscola());
        System.out.println("Serié matriculado é = " + aluno1.getSerieMatriculado());


        System.out.println("========================================================================");
        /*=========================================================================================*/
        Aluno aluno2 = new Aluno();/*Aqui será o Pedro*/
        aluno2.setNome("Pedro");
        aluno2.setIdade(28);
        aluno2.setDataNacimento("06/04/1992");
        aluno2.setRegistroGeral("333.333");
        aluno2.setNumeroCpf("000.000.000-00");
        aluno2.setNomeMae("Ester");
        aluno2.setNomePai("Maicon");
        aluno2.setDataMatricula("01/02/2015");
        aluno2.setNomeEscola("Escola de treinamento java Adriel");
        aluno2.setSerieMatriculado("3°");

        System.out.println("Nome é = " + aluno2.getNome());
        System.out.println("Idade é = " + aluno2.getIdade());
        System.out.println("Data de nacimento é = " + aluno2.getDataNacimento());
        System.out.println("Registro Geral é = " + aluno2.getRegistroGeral());
        System.out.println("Numero do CPF é = " + aluno2.getNumeroCpf());
        System.out.println("Nome da mãe é = " + aluno2.getNomeMae());
        System.out.println("Nome do pai é = " + aluno2.getNomePai());
        System.out.println("Data de matricula é = " + aluno2.getDataMatricula());
        System.out.println("Nome da escola é = " + aluno2.getNomeEscola());
        System.out.println("Serié de matricula é = " + aluno2.getSerieMatriculado());



        /*===========================================================================================================*/

        Aluno aluno3 = new Aluno();/*Aqui será o Adriel*/

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("josé",50);

    }








}



