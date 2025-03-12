public class Prints {


    public static void printBemVindo(){
        System.out.println("Olá, seja bem vindo ao programa!!!");
    }


    public static void printMenu(){
        System.out.println(
                new StringBuilder()
                        .append("O que deseja fazer ? Digite o numero da opção e pressione enter: \n")
                        .append("1 - Cadastrar o usuário \n")
                        .append("2 - Listar todos usuários cadastrados \n")
                        .append("3 - Cadastrar nova pergunta no formulário \n")
                        .append("4 - Deletar pergunta do formulário \n")
                        .append("5 - Pesquisar usuário por nome ou idade ou email \n")
                        .append("OU DIGITE QUALQUER OUTRO NÚMERO PARA SAIR DO PROGRAMA").toString()
        );
    }
}
