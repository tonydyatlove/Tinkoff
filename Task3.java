import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task3 {

    public static int algorithm(String range) {
        Set<String> example = new HashSet<>();
        String[] elements = range.split("");
        int[] lengthOfRangeForEachElement = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            lengthOfRangeForEachElement[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < elements.length; i++) {
            if (example.size() == 4) {
                break;
            }
            lengthOfRangeForEachElement[0] = i + 1;
            example.add(elements[i]);
            if(i == elements.length - 1 && example.size() < 4)
                return -1;
        }
        for (int i = 1; i < elements.length; i++) {
            if (elements[i].equals(elements[i - 1]))
                lengthOfRangeForEachElement[i] = lengthOfRangeForEachElement[i - 1] - 1;
            else {
                example.clear();
                for (int j = i; j < elements.length; j++) {
                    example.add(elements[j]);
                    if (example.size() == 4) {
                        lengthOfRangeForEachElement[i] = j - i + 1;
                        break;
                    }
                }
            }
        }
        return Arrays.stream(lengthOfRangeForEachElement).min().getAsInt();
    }

    public static void main(String[] args) {
       try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
           int n = Integer.parseInt(bufferedReader.readLine());
           String data = bufferedReader.readLine();
           System.out.println(algorithm(data));
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
