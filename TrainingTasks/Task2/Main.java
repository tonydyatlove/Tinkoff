/*
Ваня принес на кухню рулет, который он хочет разделить с коллегами. Для этого он хочет разрезать рулет на N равных частей.
Разумеется, рулет можно резать только поперек. Соотвественно, Ваня сделает N−1 разрез ножом через равные промежутки.
По возвращению с кофе-брейка Ваня задумался — а можно ли было обойтись меньшим числом движений,
будь нож Вани бесконечно длинным (иначе говоря, если он мог бы сделать сколько угодно разрезов за раз, если эти разрезы лежат на одной прямой)?
Считается, что места для разрезов намечены заранее, и все разрезы делаются с ювелирной точностью.
Оказывается, что можно. Например, если Ваня хотел бы разделить рулет на 4 части, он мог бы обойтись двумя разрезами — сначала он разделил бы рулет на две половинки,
а потом совместил бы две половинки и разрезал обе пополам одновременно.
Вам дано число N, требуется сказать, каким минимальным числом разрезов можно обойтись.
*/
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
