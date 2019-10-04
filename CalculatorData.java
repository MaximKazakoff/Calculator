public class CalculatorData {


    private String num1 = "";
    private String num2 = "";
    private String operation_symbol = "";
    private String error_status = "0";
    private int result = 0;
    private String romeResult;
    private int romeStatus = 0;


    public void initialize(String num1, String num2, String operation_symbol) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation_symbol = operation_symbol;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

    public String getOperationSymbol() {
        return operation_symbol;
    }

    public String getErrorStatus() {
        return error_status;
    }

    public int getRomeStatus() {
        return romeStatus;
    }

    public void printErrorData() {
        System.out.print(num1);
        System.out.print(operation_symbol);
        System.out.println(num2);
    }

    public String getItog() {
        if (romeStatus == 0) {
            return "" + result;
        } else {
            return romeResult;
        }
    }

    public int getResult() {
        return result;
    }


    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setOperationSymbol(String operation_symbol) {
        this.operation_symbol = operation_symbol;
    }

    public void setErrorStatus(String error_status) {
        this.error_status = error_status;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setRomeStatus(int romeStatus) {
        this.romeStatus = romeStatus;
    }

    public void setRomeResult(String romeResult) {
        this.romeResult = romeResult;
    }


}
