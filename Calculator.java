import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Exceptions ex = new Exceptions();
        ex.isException();
    }

    public static void calculate() {
        Scanner input = new Scanner(System.in);

        double result = 0;

        System.out.print("Enter an expression to compute: ");
        String userInput = input.nextLine();

        String[] tokens = userInput.split("");
        int token0 = Integer.parseInt(tokens[0]);
        int token2 = Integer.parseInt(tokens[2]);
        char el_1 = tokens[1].charAt(0);

        if (tokens.length == 3 && (token0 >= 1 && token0 <= 10) && (token2 >= 1 && token2 <= 10)) {
            switch (el_1) {
                case '+':
                    result = token0 + token2;
                    break;
                case '-':
                    result = token0 - token2;
                    break;
                case '*':
                    result = token0 * token2;
                    break;
                case '/':
                    result = (double)token0 / token2;
            }

            System.out.println(result);

        }
        else {

            char el_2 = tokens[3].charAt(0);
            int token4 = Integer.parseInt(tokens[4]);

            if (tokens.length == 5 && (token0 >= 1 && token0 <= 10) && (token2 >= 1 && token4 <= 10) && (token4 >= 1 && token4 <= 10)) {
                if (el_1 == '*' && el_2 == '*') {
                    result = token0 * token2 * token4;
                }
                if (el_1 == '*' && el_2 == '+') {
                    result = token0 * token2 + token4;
                }
                if (el_1 == '*' && el_2 == '-') {
                    result = token0 * token2 - token4;
                }
                if (el_1 == '*' && el_2 == '/') {
                    result = token0 * (double)token2 / token4;
                }

                if (el_1 == '/' && el_2 == '/') {
                    result = (double)token0 / token2 / token4;
                }
                if (el_1 == '/' && el_2 == '*') {
                    result = (double)token0 / token2 * token4;
                }
                if (el_1 == '/' && el_2 == '+') {
                    result = (double)token0 / token2 + token4;
                }
                if (el_1 == '/' && el_2 == '-') {
                    result = (double)token0 / token2 - token4;
                }

                if (el_1 == '+' && el_2 == '+') {
                    result = token0 + token2 + token4;
                }
                if (el_1 == '+' && el_2 == '-') {
                    result = token0 + token2 - token4;
                }
                if (el_1 == '+' && el_2 == '*') {
                    result = token2 * token4 + token0;
                }
                if (el_1 == '+' && el_2 == '/') {
                    result = (double)token2 / token4 + token0;
                }

                if (el_1 == '-' && el_2 == '-') {
                    result = token0 - token2 - token4;
                }
                if (el_1 == '-' && el_2 == '+') {
                    result = token0 - token2 + token4;
                }
                if (el_1 == '-' && el_2 == '*') {
                    result = -1 * (token2 * token4 - token0);
                }
                if (el_1 == '-' && el_2 == '/') {
                    result = -1 * ((double)token2 / token4 - token0);
                }

                System.out.println(result);
            } else {
                System.out.println("INCORRECT INPUT DATA");
            }
        }
    }
}