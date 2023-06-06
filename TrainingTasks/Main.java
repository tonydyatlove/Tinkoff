/*
Костя подключен к мобильному оператору «Мобайл». Абонентская плата Кости составляет A рублей в месяц. 
За эту стоимость Костя получает B мегабайт интернет-трафика. Если Костя выйдет за лимит трафика, то каждый следующий мегабайт будет стоить ему C рублей.
Костя планирует потратить D мегабайт интернет-трафика в следующий месяц. Помогите ему сосчитать, во сколько рублей ему обойдется интернет.
*/
import java.io.*;

public class Main {

    public static int overallCost(int subscriptionFee, int receivedMegabytes, int costOfAdditionalMegabyte, int spentMegabytes) {
        int cost = subscriptionFee;
        if (spentMegabytes > receivedMegabytes)
            cost += (spentMegabytes - receivedMegabytes) * costOfAdditionalMegabyte;
        return cost;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = bufferedReader.readLine();
            String[] inputData = line.split("  ");
            System.out.println(overallCost(Short.parseShort(inputData[0]), Short.parseShort(inputData[1]), Short.parseShort(inputData[2]), Short.parseShort(inputData[3])));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
