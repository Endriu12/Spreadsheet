import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Andriu on 27.01.2017.
 * It is test for my work.....
 */
class RegezS {
    public static void test(String nameS) {
        if (nameS.indexOf("=") == 0) {
            nameS = nameS.replaceFirst("=", "");
            String[] strs = nameS.split("(-|\\+|\\*|\\/){1}");
            double[] dbl = new double[strs.length];
            for (int i = 0; i < strs.length; i++) {
                dbl[i] = Double.valueOf(strs[i]);
                System.out.println(dbl[i]);
            }
        } else if (nameS.contains("'")) {
            nameS = nameS.replaceAll("'", "");
            System.out.println(nameS);
        } else {
            System.out.println("#");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        RegezS regezS = new RegezS();
        Scanner input = new Scanner(System.in);
        String str = null;
        while (input.hasNextLine()) {
            str = input.nextLine();
            regezS.test(str);
        }
    }
}
