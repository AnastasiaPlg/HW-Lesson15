package task3;

public class Logic<T> {
    private int number;

    public Logic(int number) {
        this.number = number;
    }

    public void choseLogic(T parameter) {
        if (number == 1) {
            FunctionalInterface<String> stringFunctionalInterface = () -> {
                String newLine;
                StringBuilder sb = new StringBuilder((String) parameter);
                newLine = sb.reverse().toString();
                System.out.println(newLine);
            };
            stringFunctionalInterface.makeAction();
        }
        if (number == 2) {
            FunctionalInterface<Integer> integerFunctionalInterface = () -> {
                int m = 1;
                int f = 0;
                for (int i = 1; i < (Integer) parameter + 1; i++) {
                    f = m * i;
                    m = f;
                }
                System.out.println(f);
            };
            integerFunctionalInterface.makeAction();
        }
    }
}
