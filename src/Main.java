import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the first number.\nType 0 to exit the program");
            int num1 = scanner.nextInt(); // Input is type integer

            if (num1 == 0) {
                break;
            }


            else {

                System.out.println("Please enter an operation.\n+, -, *, /, s, or e");
                String opp = scanner.next();


                if (opp.equals("+") || opp.equals("-") || opp.equals("*") || opp.equals("/") || opp.equals("e")) {

                    System.out.println("Enter a second number:");
                    int num2 = scanner.nextInt();

                    if (opp.equals("+")) {
                        System.out.println(num1 + num2);

                    }

                    else if (opp.equals("-")) {
                        System.out.println(num1 - num2);

                    }

                    else if (opp.equals("*")) {
                        System.out.println(num1 * num2);

                    }

                    else if (opp.equals("/")) {
                        System.out.println(num1 / num2);

                    }

                    else if (opp.equals("e")) {

                        if (num2 >= 0) {

                            int i = 0;
                            int exp = 1;

                            while (i < num2) {
                                exp = exp * num1;
                                i++;
                            }

                            System.out.println(exp);

                        }

                        else {

                            System.out.println("Error: Illegal exponent");
                        }
                    }


                }

                else if (opp.equals("s")) {

                    if (num1 > 0) {

                        System.out.println(Math.sqrt(num1));
                    }

                    else {
                        System.out.println("Error: Negative Square Root");
                    }


                }


                else {
                    System.out.println("Unknown operation");

                }

            }


        }

        scanner.close();
    }
}
