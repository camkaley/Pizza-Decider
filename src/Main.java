import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> pizzas = new ArrayList<String>();
        ArrayList<String> crusts = new ArrayList<String>();

        getInfo(pizzas, "res/files/Pizzas.txt");
        getInfo(crusts, "res/files/crusts.txt");

        System.out.print("Your pizzas is: " + chooseOption(pizzas) + " with " + chooseOption(crusts));
    }

    public static void getInfo(ArrayList array, String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }
    }

    public static String chooseOption(ArrayList array){
        Random r = new Random();
        int item = r.nextInt(array.size());
        String option = array.get(item).toString();
        return option;
    }
}
