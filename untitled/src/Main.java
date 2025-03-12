import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pathReaderQuestions = "C:\\temp\\Registro_Usuario\\arquivos\\formulario\\formulario.txt";
        List<String> registrationQuestions;
        int userChoose;
        User user = new User();
        int userCount = 1;

        Prints.printBemVindo();

        try(BufferedReader br = new BufferedReader(new FileReader(pathReaderQuestions));
            Scanner scanner = new Scanner(System.in)) {

            registrationQuestions = Reader.listQuestions(br);

            do {
                Prints.printMenu();
                userChoose = scanner.nextInt();
                scanner.nextLine();


                switch (userChoose){
                    case 1:

                        List<String> userAnswers = new ArrayList<>();

                        for(int i = 0; i < registrationQuestions.size(); i++){

                            System.out.println(registrationQuestions.get(i));
                            String answer = scanner.nextLine();

                            switch (i) {
                                case 0:
                                    user.setName(answer);
                                    break;
                                case 1:
                                    user.setEmail(answer);
                                    break;
                                case 2:
                                    user.setAge(Integer.parseInt(answer));
                                    break;
                                case 3:
                                    user.setHeight(Double.parseDouble(answer));
                            }
                            userAnswers.add(registrationQuestions.get(i).charAt(0) + "-" +answer); // add indice da pergunta + resposta na lista;

                            user.setId(userCount);


                        }

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\Registro_Usuario\\arquivos\\usuarios\\" + userCount + "-" + user.getName().strip().toUpperCase().strip() + ".txt"))){
                            for(int j = 0; j < userAnswers.size(); j++) {
                                bw.write(userAnswers.get(j));
                                bw.newLine();
                            }
                            userCount++;
                        }

                        System.out.println(user + "\n");

                    case 2:
                }

            }

            while(userChoose >= 1 && userChoose <=5);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}