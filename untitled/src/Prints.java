public class Prints {


    public static void printBemVindo(){
        System.out.println("Olá, seja bem vindo ao programa!!!");
    }


    public static void printMenu(){
        System.out.println(
                """
                        O que deseja fazer ? Digite o numero da opção e pressione enter:\s
                        1 - Cadastrar o usuário\s
                        2 - Listar todos usuários cadastrados\s
                        3 - Cadastrar nova pergunta no formulário\s
                        4 - Deletar pergunta do formulário\s
                        5 - Pesquisar usuário por nome ou idade ou email\s
                        OU DIGITE QUALQUER OUTRO NÚMERO PARA SAIR DO PROGRAMA"""
        );
    }
}
