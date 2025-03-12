import java.io.BufferedReader;
import java.io.IOException;
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


}
