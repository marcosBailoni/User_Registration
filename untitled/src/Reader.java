import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static  List<String> listQuestions(BufferedReader br) {

        String line;
        List<String> list = new ArrayList<>();

        try{
            while((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    public static void printUsers() {
        File fileDirectory = new File("C:\\temp\\Registro_Usuario\\arquivos\\usuarios");

        int count = 1;

        File[] userFiles = fileDirectory.listFiles();

        if(!fileDirectory.exists() || !fileDirectory.isDirectory()){
            throw new RuntimeException("Diretório inválido");
        }

        for(File f: userFiles){
            try(BufferedReader br = new BufferedReader(new FileReader(f))){
                String printLine = br.readLine();

                if (printLine != null && !printLine.isEmpty()) {
                    printLine = count + printLine.substring(2); // Substitui apenas o primeiro caractere pelo número count
                }

                count++;
                System.out.println(printLine);


            } catch (IOException | NullPointerException e) {
                System.out.println(e.getMessage());
            }

        }
    }


}
