import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rim = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] znak = new String[]{"+", "-", "*", "/"};
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        System.out.println();
        String prim = in.nextLine();
        System.out.println();
        System.out.println("Output:");
        System.out.println();
        String[] word = new String[3];
        word = prim.split(" ");
        if (prov(word[0], arab) & prov(word[1], znak) & prov(word[2], arab) |
                prov(word[0], rim) & prov(word[1], znak) & prov(word[2], rim)) {
            if (prov(word[0], arab)) {
                dey(word[0],word[1],word[2]);
            }
            else {
               System.out.println(rch(dey1(rtoa(word[0], rim),word[1],rtoa(word[2], rim))));
            }
        } else {
            System.out.println("Неверный ввод.");
        }
        in.close();
    }
    static boolean prov(String x, String mas[]) {
        for (int i = 0; i < mas.length; i++) {
            if (x.equals(mas[i]))
                return true;
        }
        return false;
    }
    static void dey(String a, String z, String b) {
        Integer ai = Integer.parseInt(a);
        Integer bi = Integer.parseInt(b);
        switch (z){
            case "+":
                System.out.println(ai+bi);
                break;
            case  "-":
                System.out.println(ai-bi);
                break;
            case "*":
                System.out.println(ai*bi);
                break;
            case "/":
                System.out.println(ai/bi);
                break;
        }
    }
    static int dey1(int a, String z, int b) {
        int v = 0;
        switch (z){
            case "+":
            v = a + b;
            break;
            case  "-":
                v = a - b;
            break;
            case "*":
                v = a * b;
            break;
            case "/":
                v = a / b;
            break;
            }
            return v;
    }
    static int rtoa(String r, String ri[]) {
        int i;
        for (i = 0; i < ri.length-1; i++){
            if (r.equals(ri[i]))
            break;
    }
        return i+1;
        }
    static String rch(int ch) {
        String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rim = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] rimd = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String rch1 = new String();
        if (ch == 100) {rch1="C";}
        else {
        rch1 = rimd[ch/10] + rim[ch%10];}
        return rch1;
        }
}
