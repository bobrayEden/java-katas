package kata;

import java.util.Arrays;

public class Chmod {

    public static String convert(String numerical) {
        StringBuilder s = new StringBuilder();
        String[] bin = decToBin(numerical);
        for (int i = 0; i < bin.length; i++) {
            for (int j = 0; j < bin[i].length(); j++) {
                if (j == 0 && bin[i].charAt(j) == '1') {
                    s.append("r");
                }
                else if (j == 1 && bin[i].charAt(j) == '1')  {
                    s.append("w");
                }
                else if (j == 2 && bin[i].charAt(j) == '1')  {
                    s.append("x");
                } else {s.append("-");}
            }
        }

        return s.toString();
    }

    public static String[] decToBin(String numerical) {
        int[] tab = new int[numerical.length()];
        String[] bin = new String[3];
        for (int i = 0; i < numerical.length(); i++) {
            tab[i] = Integer.parseInt("" + numerical.charAt(i));
            bin[i] = Integer.toBinaryString(tab[i]);
            switch (bin[i].length()) {
                case 1:
                    bin[i] = "00" + bin[i];
                    break;
                case 2:
                    bin[i] = "0" + bin[i];
                    break;
            }
        }
        return bin;

    }
}
