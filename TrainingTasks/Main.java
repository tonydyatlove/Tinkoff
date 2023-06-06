import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int cutTheRoll(int amountOfPeople) {
        int numOfCuts;
        double degree = Math.log(amountOfPeople) / Math.log(2);
        if (amountOfPeople == 1)
            numOfCuts = 0;
        else if (degree % 1 == 0)
            numOfCuts = (int) degree;
        else
            numOfCuts = (int) degree + 1;

        return numOfCuts;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = bufferedReader.readLine();
            System.out.println(cutTheRoll(Integer.parseInt(line)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}