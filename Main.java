import java.util.*;

public class Main {
    public static int[] sortedArrayAsc(int[] heightOfPeople) {
        return Arrays.stream(heightOfPeople).sorted().toArray();
    }

    public static int[] sortedArrayDesc(int[] heightOfPeople) {
        return Arrays.stream(heightOfPeople)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static String algorithm(int[] heightOfPeople) {
        int[] sortedArray1 = sortedArrayAsc(heightOfPeople);
        int[] sortedArray2 = sortedArrayDesc(heightOfPeople);
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < heightOfPeople.length; i++) {
            flag1 = false;
            if(heightOfPeople[i] == sortedArray1[i])
                flag1 = true;
            else break;
        }

        for (int i = 0; i < heightOfPeople.length; i++) {
            flag2 = false;
            if(heightOfPeople[i] == sortedArray2[i])
                flag2 = true;
            else break;
        }
        if(flag1 || flag2)
            return "YES";
        else return "NO";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] people = new int[4];
        for (int i = 0; i < 4; i++) {
            people[i] = scanner.nextInt();
        }
        System.out.println(algorithm(people));
    }
}    
