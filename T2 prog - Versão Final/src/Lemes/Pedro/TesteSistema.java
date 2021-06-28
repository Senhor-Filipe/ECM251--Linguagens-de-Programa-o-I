package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.enumerates.Horas;
import s0c13ty_MAsK.enumerates.MemBros;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {
    private static ArrayList<MemBros> listaMembros = new ArrayList<>();


    public static void run() throws IOException {

        Horas horarioatual = Horas.NORMAL;
        Scanner scanner = new Scanner(System.in);
        boolean iniciar = true;

        System.out.println("Bem vindo ao sistema da MAsK_s0c13ty");
        System.out.println("Seu horário atual é: " + horarioatual);
        System.out.println("=====================================");


        while(iniciar) {

            System.out.println("Qual opção deseja executar?\n" +
                    "1 - Mudar seu horario atual \n" +
                    "2 - Cadastro de membros novos \n" +
                    "3 - Saber seu horário atual \n" +
                    "4 - Remocao de membro \n" +
                    "5 - Postar mensagens dos membros \n" +
                    "6 - Apresentação dos membros\n" +
                    "7 - Terminar sistema");
            int resp = scanner.nextInt();


            switch (resp){
                case 1:
                    if (horarioatual == Horas.NORMAL){
                        horarioatual = Horas.EXTRA;
                        System.out.println("Seu horário foi alterado com sucesso!");
                    }
                    else{
                        horarioatual = Horas.NORMAL;
                        System.out.println("Seu horário foi alterado com sucesso!");
                    }
                    System.out.println("Seu horário é: " + horarioatual);
                    break;

                case 2:
                    cadastroMembros();
                    break;

                case 3:
                    System.out.println("Seu horário é: " + horarioatual);
                    break;

                case 4:
                    removerMembro();
                    System.out.println("Membro removido!");
                    break;

                case 5:
                    for (MemBros membro : listaMembros) {
                        System.out.println(membro.getNome());
                        membro.Mensagem(horarioatual);
                    }
                    break;

                case 6:
                    for (MemBros membro: listaMembros) {
                        membro.apresentacao();
                    }
                    break;


                case 7:
                    TesteControl TesteControl = new TesteControl();
                    TesteControl.Control(listaMembros);
                    iniciar = false;
                    System.out.println("===============\n" +
                            "0br1g4d0 por usar o sistema.\n" +
                            "Finalizando o sistema! Bons códigos.");
            }
        }
    }


    public static void cadastroMembros () throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja adicionar um novo membro?\n" +
                "1 - Sim \n" +
                "2 - Não");

        int resposta = scanner.nextInt();


        while (resposta == 1) {

            System.out.println("Que tipo de membro gostaria de adicionar?\n" +
                    "1 - Mobile Members\n" +
                    "2 - Heavy Lifters\n" +
                    "3 - Script Guys \n" +
                    "4 - Big Brothers");
            int add = scanner.nextInt();

            System.out.println("Qual o nome do membro?");
            String nome = scanner.next();

            System.out.println("Qual o email?");
            String email = scanner.next();

            System.out.println("Qual o ID?");
            int ID = scanner.nextInt();


            switch (add) {
                case 1:
                    listaMembros.add(new Mobile(nome, email, ID, MemBros.Mobile_Members));
                    break;

                case 2:
                    listaMembros.add(new Heavy(nome, email, ID, MemBros.Heavy_Lifters));
                    break;

                case 3:
                    listaMembros.add(new Script(nome, email, ID, MemBros.Script_Guys));
                    break;

                case 4:
                    listaMembros.add(new Big(nome, email, ID, MemBros.Big_Brothers));
                    break;
            }


            System.out.println("Você deseja cadastrar outro membro?\n" +
                    "1 - Sim \n" +
                    "2 - Não");
            resposta = scanner.nextInt();
        }
    }


    public static void removerMembro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja excluir um membro?\n" +
                "1 - Sim \n" +
                "2 - Não");
        int resposta = scanner.nextInt();

        while (resposta == 1) {

            System.out.println("Você deseja apagar qual posição?");
            int excluir = scanner.nextInt();

            listaMembros.remove(excluir);

            System.out.println("Voce deseja remover outro membro?\n" +
                    "1 - Sim \n" +
                    "2 - Não");
            resposta = scanner.nextInt();

        }
    }
}