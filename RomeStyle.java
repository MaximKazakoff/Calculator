public class RomeStyle {

    private static String unitRome(int unit) {
        String romeUnit = "";
        switch (unit) {
            case 0:
                romeUnit = "";
                break;
            case 1:
                romeUnit = "I";
                break;
            case 2:
                romeUnit = "II";
                break;
            case 3:
                romeUnit = "III";
                break;
            case 4:
                romeUnit = "IV";
                break;
            case 5:
                romeUnit = "V";
                break;
            case 6:
                romeUnit = "VI";
                break;
            case 7:
                romeUnit = "VII";
                break;
            case 8:
                romeUnit = "VIII";
                break;
            case 9:
                romeUnit = "IX";
                break;
        }

        return romeUnit;
    }

    private static String decadeRome(int decade) {
        String romeDecade = null;

        switch (decade) {
            case 1:
                romeDecade = "X";
                break;
            case 2:
                romeDecade = "XX";
                break;
            case 3:
                romeDecade = "XXX";
                break;
            case 4:
                romeDecade = "XL";
                break;
            case 5:
                romeDecade = "L";
                break;
            case 6:
                romeDecade = "LX";
                break;
            case 7:
                romeDecade = "LXX";
                break;
            case 8:
                romeDecade = "LXXX";
                break;
            case 9:
                romeDecade = "XC";
                break;

        }

        return romeDecade;
    }

    public static void start(CalculatorData calculatorData) {

        if (calculatorData.getResult() == 0) {
            calculatorData.setRomeResult("0");
        } else if (Math.abs(calculatorData.getResult()) / 10 == 10) {
            if (calculatorData.getResult() >= 0) {
                calculatorData.setRomeResult("C");
            } else {
                calculatorData.setRomeResult("-C");
            }
        } else if(Math.abs(calculatorData.getResult()) / 10 == 0){
            int unit = Math.abs(calculatorData.getResult()) % 10;
            String strUnit = unitRome(unit);

            if (calculatorData.getResult() > 0) {
                calculatorData.setRomeResult(strUnit);
            } else {
                calculatorData.setRomeResult("-" + strUnit);
            }

        } else {
            int unit = Math.abs(calculatorData.getResult()) % 10;
            String strUnit = unitRome(unit);
            int decade = Math.abs(calculatorData.getResult()) / 10;
            String strDecade = decadeRome(decade);

            if (calculatorData.getResult() > 0) {
                calculatorData.setRomeResult(strDecade + strUnit);
            } else {
                calculatorData.setRomeResult("-" + strDecade + strUnit);
            }
        }
    }
}
