public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
        count(arr);
    }

    public static void count(int[] arr) {
        Hashtable<Integer, Integer> dict = new Hashtable<Integer, Integer>();
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j : arr) {

                if (j % i == 0) {
                    count++;
                }
            }
            dict.put(i, count);
        }
        System.out.println(dict);

    }
