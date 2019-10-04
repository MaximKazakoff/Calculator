import java.util.HashMap;

class CreateResult {

    static void start(CalculatorData calculatorData) {
        String operation_symbol = calculatorData.getOperationSymbol();
        int num1 = Integer.parseInt(calculatorData.getNum1());
        int num2 = Integer.parseInt(calculatorData.getNum2());

        if (num1 < 0 || num2 < 0 || num1 > 10 || num2 > 10) {
            calculatorData.setErrorStatus("1");
        } else {
            switch (operation_symbol) {
                case "+":
                    calculatorData.setResult(num1 + num2);
                    break;
                case "-":
                    calculatorData.setResult(num1 - num2);
                    break;
                case "*":
                    calculatorData.setResult(num1 * num2);
                    break;
                case "/":
                    if (num1 == 0 || num2 == 0) {
                        calculatorData.setErrorStatus("1");
                    } else {
                        calculatorData.setResult(num1 / num2);
                    }

                    break;
            }
        }

        if (calculatorData.getRomeStatus() == 1) {
            RomeStyle.start(calculatorData);
        }

        if (calculatorData.getResult()>100 || calculatorData.getResult()<-100){
            calculatorData.setErrorStatus("1");
        }


    }
}
