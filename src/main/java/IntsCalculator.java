public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int value1, int value2) {
        int result = (int) target.newFormula()
                .addOperand(value1)
                .addOperand(value2)
                .calculate(Calculator.Operation.SUM)
                .result();
        return result;
    }

    @Override
    public int sub(int value1, int value2) {
        int result = (int) target.newFormula()
                .addOperand(value1)
                .addOperand(value2)
                .calculate(Calculator.Operation.SUB)
                .result();
        return result;
    }

    @Override
    public int mult(int value1, int value2) {
        int result = (int) target.newFormula()
                .addOperand(value1)
                .addOperand(value2)
                .calculate(Calculator.Operation.MULT)
                .result();
        return result;
    }

    @Override
    public int div(int value1, int value2) {
        int result = (int) target.newFormula()
                .addOperand(value1)
                .addOperand(value2)
                .calculate(Calculator.Operation.DIV)
                .result();
        return result;
    }

    @Override
    public int pow(int value1, int value2) {
        int result = (int) target.newFormula()
                .addOperand(value1)
                .addOperand(value2)
                .calculate(Calculator.Operation.POW)
                .result();
        return result;
    }
}
