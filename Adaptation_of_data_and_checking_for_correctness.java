
/*
 *
 * @author: Kazakov Maksim
 * @email: m.c.kazakov.politolog@gmail.com
 * @date: 2019.10.03
 *
 */


class Adaptation_of_data_and_checking_for_correctness {

    static void start(CalculatorData calculatorData) {
        String num1 = calculatorData.getNum1();
        String num2 = calculatorData.getNum2();
        String operation_symbol = calculatorData.getOperationSymbol();

        if ((num1.matches("[1023456789]") || num1.matches("10")) && (num2.matches("[1023456789]") || num2.matches("10"))) {
//            System.out.println("arab");
            calculatorData.setNum1(num1);
            calculatorData.setNum2(num2);
        } else if ((num1.matches("I") || num1.matches("II") || num1.matches("III") || num1.matches("IV") ||
                    num1.matches("V") || num1.matches("VI") || num1.matches("VII") || num1.matches("VIII") ||
                    num1.matches("IX") || num1.matches("X"))
                    &&
                    (num2.matches("I") || num2.matches("II") || num2.matches("III") || num2.matches("IV") ||
                    num2.matches("V") || num2.matches("VI") || num2.matches("VII") || num2.matches("VIII") ||
                    num2.matches("IX") || num2.matches("X"))) {

            calculatorData.setRomeStatus(1);
            switch (num1) {
                case "I":
                    calculatorData.setNum1("1");
                    break;
                case "II":
                    calculatorData.setNum1("2");
                    break;
                case "III":
                    calculatorData.setNum1("3");
                    break;
                case "IV":
                    calculatorData.setNum1("4");
                    break;
                case "V":
                    calculatorData.setNum1("5");
                    break;
                case "VI":
                    calculatorData.setNum1("6");
                    break;
                case "VII":
                    calculatorData.setNum1("7");
                    break;
                case "VIII":
                    calculatorData.setNum1("8");
                    break;
                case "IX":
                    calculatorData.setNum1("9");
                    break;
                case "X":
                    calculatorData.setNum1("10");
                    break;
            }

            switch (num2) {
                case "I":
                    calculatorData.setNum2("1");
                    break;
                case "II":
                    calculatorData.setNum2("2");
                    break;
                case "III":
                    calculatorData.setNum2("3");
                    break;
                case "IV":
                    calculatorData.setNum2("4");
                    break;
                case "V":
                    calculatorData.setNum2("5");
                    break;
                case "VI":
                    calculatorData.setNum2("6");
                    break;
                case "VII":
                    calculatorData.setNum2("7");
                    break;
                case "VIII":
                    calculatorData.setNum2("8");
                    break;
                case "IX":
                    calculatorData.setNum2("9");
                    break;
                case "X":
                    calculatorData.setNum2("10");
                    break;
            }
        } else {
//            System.out.println("1.1");
            calculatorData.setErrorStatus("1");
        }

        if (operation_symbol.length() > 1) {
//            System.out.println("1.2");
            calculatorData.setErrorStatus("1");
        }
    }
}
