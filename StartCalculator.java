import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;

public class StartCalculator {

    public static void main(String[] args) throws IOException {

        int i = 0;
        while (i < 99) {
            CalculatorData calculatorData = new CalculatorData();
            GetData.createGetData(calculatorData);

            Adaptation_of_data_and_checking_for_correctness.start(calculatorData);

            if (calculatorData.getErrorStatus().equals("1")) {
//                calculatorData.printErrorData();
                System.out.println("Ошибка данных 1");
                break;
            }

            CreateResult.start(calculatorData);

            if (calculatorData.getErrorStatus().equals("1")) {
//                calculatorData.printErrorData();
                System.out.println("Ошибка данных 2");
                break;
            } else {
                System.out.println(calculatorData.getItog());

            }

            i++;
        }
    }
}
