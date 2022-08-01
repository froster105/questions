public static void main(String[] args) {
        checker(2);
    }

    public static void checker(int input) {
        int val = input;
        if (val % 2 != 0) {
            generator(val);
        } else {
            generator(val - 1);
        }
    }

    public static void generator(int input) {

        System.out.print(1 + ",");
        for (int i = 1; i < input; i++) {
            System.out.print(2 * i + 1 + ",");
        }
    }
