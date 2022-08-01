class calculator {
    public double calci(double a, double b, String TypeOfOperation) {
        if (TypeOfOperation.equals("Addition")) {
            return a + b;
        } else if (TypeOfOperation.equals("Substraction")) {
            return a - b;
        } else if (TypeOfOperation.equals("Multiplication")) {
            return a * b;
        }
        return a / b;

    }

}
