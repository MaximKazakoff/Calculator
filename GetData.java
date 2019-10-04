import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GetData {


    static void createGetData(CalculatorData calculatorData) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sData = reader.readLine();
        Pattern pattern = Pattern.compile("\\d|[+-/*]|[IVX]");
        Matcher matcher = pattern.matcher(sData);

        String num1 = "";
        String num2 = "";
        String operation_symbol = "";

        while (matcher.find()) {
            String element = sData.substring(matcher.start(), matcher.end());
            if (operation_symbol.equals("")) {
                if (element.matches("[+-/*]")) {
                    operation_symbol = element;
                } else {
                    num1 = num1 + element;
                }
            } else {
                num2 = num2 + element;
            }
        }

        calculatorData.initialize(num1, num2, operation_symbol);
    }
}
