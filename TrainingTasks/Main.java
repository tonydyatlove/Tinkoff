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